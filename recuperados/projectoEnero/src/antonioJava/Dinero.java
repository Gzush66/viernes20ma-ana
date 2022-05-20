package antonioJava;

public class Dinero {
	
	//atributos estaticos (a nivel de clase, para todo objeto)
	//se pone static porque es a nivel de clase (el mismo valor para todos los objetos)
	private static final float DOLAR_A_EURO= 0.88f;
	private static final float EURO_A_DOLAR= 1.13f;
	
	//atributos
	private float cantidad;
	private String divisa;
	
	//constructor
	public Dinero(float cantidad, String divisa) {
		this.cantidad = cantidad;
		this.divisa = divisa;
	}
	
	//constructor con el mismo nombre pero distintos parámetros (polimorfismo)
	//si no especificamos divisa inicial entonces la establecemos a EUR
	public Dinero(float cantidad) {
		this(cantidad, "EUR");
	}
		
	//con este metodo cambiamos el valor de otroDinero
	public void igualarDivisa(Dinero otroDinero) {
		String miDivisa = this.divisa; 
		String otraDivisa = otroDinero.divisa; 
						
		//si no son iguales
		if( ! (miDivisa.equals(otraDivisa)) ) {
			//paso de dolares a euros
			if (miDivisa.equals("EUR") && otraDivisa.equals("DOL"))
			{
				otroDinero.cantidad = 
						otroDinero.cantidad * DOLAR_A_EURO; //46
				otroDinero.divisa = "EUR";				
			}
			else if (miDivisa.equals("DOL") && otraDivisa.equals("EUR"))
			{
				otroDinero.cantidad = 
						otroDinero.cantidad * EURO_A_DOLAR; 
				otroDinero.divisa = "DOL";				
			}
		}		
	}
	
	//con este metodo no cambiamos el valor de otroDinero
	public Dinero devolverDineroConDivisaIgualada(Dinero otroDinero) {
		String miDivisa = this.divisa; 
		String otraDivisa = otroDinero.divisa; 
		
		//creo un objeto aux para no modificar el que se le pasa
		Dinero dineroConvertido = 
			new Dinero(otroDinero.cantidad,otroDinero.divisa); 
				
		//si no son iguales
		if( ! (miDivisa.equals(otraDivisa)) ) {
			//paso de dolares a euros
			if (miDivisa.equals("EUR") && otraDivisa.equals("DOL"))
			{
				dineroConvertido.cantidad = 
						otroDinero.cantidad * DOLAR_A_EURO; //46
				dineroConvertido.divisa = "EUR";				
			}
			else if (miDivisa.equals("DOL") && otraDivisa.equals("EUR"))
			{
				dineroConvertido.cantidad = 
						otroDinero.cantidad * EURO_A_DOLAR; 
				dineroConvertido.divisa = "DOL";				
			}
		}
		
		return dineroConvertido;
	}
	
	public void sumar(Dinero otroDinero) {
		/*Si uso el método igualarDivisa estaré modificando otroDinero
		 * fuera. Por ejemplo, si hago d1.sumar(d2) entonces d2 
		 * quedará con la divisa cambiada despues de sumar y no es
		 * el comportamiento deseado
		this.igualarDivisa(otroDinero);
		this.cantidad += otroDinero.cantidad;	
		*/
		
		//obtenemos una copia de otroDinero con la divisa igualada
		Dinero dineroConvertido = 
				this.devolverDineroConDivisaIgualada(otroDinero);
		this.cantidad += dineroConvertido.cantidad;		
	}

	public void doblar() {
		//sumar el objeto consigo mismo
		this.sumar(this);		
	}
	
	public void restar(Dinero otroDinero) {
		//copio el objeto para invertir la cantidad sin que se altere  
		Dinero inverso = new Dinero(
				otroDinero.cantidad * (-1), otroDinero.divisa);
		
		sumar(inverso);
	}

	public boolean esMayor(Dinero otroDinero) {		
		//obtenemos una copia de otroDinero con la divisa igualada
		Dinero dineroConvertido = 
			this.devolverDineroConDivisaIgualada(otroDinero);
		//comparar
		if(this.cantidad > dineroConvertido.cantidad) {
			return true;
		}
		else { //entonces es menor o igual 
			return false;
		}		
	}
	
	@Override
	public String toString() {
		/*Para imprimirlo con dos decimales usamos format:
		 %f imprime un float, %.2f imprime float con dos decimales
		%s imprime una cadena*/
		//String aux = String.format("%.2f %s", cantidad,divisa);
		
		String aux = cantidad+" "+divisa;
		return aux;
	}
}




