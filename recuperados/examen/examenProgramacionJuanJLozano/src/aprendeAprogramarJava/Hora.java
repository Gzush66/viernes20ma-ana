package aprendeAprogramarJava;

public class Hora {
	
	protected int hora,minutos;//atributos protegidos pensados para heredar
	Hora(int hora, int minutos){//constructor
		this.hora=hora;			//valores por defecto
		this.minutos=minutos;
		setHora(hora);	//utilizamos metodos de asignacion, que comprueben valores validos
		setMinutos(minutos);
		}

	public void inc() {	//incrementamos la hora 1 minuto
		minutos++;	
		if (minutos>59) {	//comprobamos si los minutos rebasan los 59
			minutos=0;
			hora++;	//incrementamos la hora
			if (hora>23) { 	//si la hora es mayor a 23(algo que no tiene sentido)
				hora=0;
			}
		}
	}
	
	public void setMinutos(int minutos) {
		if (0<=minutos && minutos<=60) {	//solo modificamos si el valor esta en 0..59
			this.minutos=minutos;			
		}
	}
	
	
	public void setHora (int hora) {	//solo modificamos si el valor esta en 0..23
		if (0<=hora && hora<=24) {
			this.hora=hora;
		}
	}
	
	@Override		//indica que estamos sustituyendo (overriding) el metodo
	public String toString() {
		String resultado;
		resultado=hora+" : "+minutos;
		return resultado;
	}
	
	public class Hora12 extends Hora{
		public enum Meridiano {AM, PM} //tipo enumerado, para distinguir el meridiano
		protected Meridiano mer; // indica si la hora es am(mañana) o pm (tarde)
			
			public Hora12(int hora, int minutos, Meridiano mer) {
			super(hora,minutos);//constructor superclase, permite horas de 0..23
			setHora(hora); //utilizamos nuestro propio metodo para asignar hora (de 1 a 12)
			this.mer=mer;  //asignamos el meridiano
		}
	@Override //sustituimos el metodo incrementar de la superclase
	public void inc() {
		super.inc();//incrementamos un minuto con el metodo inc() de la superclase
		//la hora puede llegar a ser las 12:00 (que aqui no tiene sentido)
		if (hora>12) {
			hora=1; //inicializamos la hora
				mer=mer ==Meridiano.AM ? Meridiano.PM : Meridiano.AM;//cambia el meridiano
		}
	}
	@Override
	public String toString() {
		String result; //cadena con el resultado a devolver
		result= super.toString(); //aprovechamos toString() de la superclase
				result+=""+mer; //añadimos a la hora pm o am
		return result;
	}
	
	
	}
	
	
	
	
	//vamos a probar la clase Hora
	public static void main(String[] args) {
		/*Hora r=new Hora(11,30);	//las 11:30
		System.out.println(r);
		for (int i=1;i<=61; i++) {	//incrementamos 61 minutos
			r.inc();
		}
		System.out.println(r);	//mostramos
		r.setHora(20);			//cambiamos la hora a las 20
		System.out.println(r);*/
		
		Hora12 r= new Hora12 (12,10,Hora12.Meridiano.AM);
		System.out.println(r);
		for (int i=1; i<=61;i++) {
			r.inc();
		}
		System.out.println(r);
		r.setHora(20);
		System.out.println(r);
		
		

	}

}
