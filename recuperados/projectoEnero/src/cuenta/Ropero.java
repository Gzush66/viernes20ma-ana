package cuenta;

public class Ropero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void igualarDivisa(Dinero otroDinero) {
		String miDiovisa=this.divisa;
		String otraDivisa = otroDinero.divisa;
		//creamos un objeto auxiliar para no modificar el que se le pase 
		Dinero dineroConvertido =
		//si no son iguales
		if(!(miDivisa.equals(otraDivisa))) {
			//PASO DE DOLARES A EUROS
			if (miDivisa.equeals ("EUR") && otraDivisa.equals("DOL")) {
				otroDinero.cantidad = otroDinero.cantidad * DOLAR_A_EURO;
				otroDinero.igualarDivisa="EUR";
			}
			else if (miDivisa.equals ("DOL") && otraDivisa.equals(("EUR")){
				
			}
			}
		}

	}

}
