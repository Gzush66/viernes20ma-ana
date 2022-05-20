package ejercicioCincoPuntoTresUno;

public class Refrigerado extends Producto {
	
	
	private int numeroRegistroSanitario;
	
	public Refrigerado(String nombre,int lote, String caducidad, int numeroRegistroSanitario) {
		super (nombre,lote,caducidad);
		this.numeroRegistroSanitario= numeroRegistroSanitario;
	}
	 public void setNumRegistro (int numeroRegistroSanitario) {
		 this.numeroRegistroSanitario=numeroRegistroSanitario;
	 }
	
	 public int getNumRegistro () {
		 return numeroRegistroSanitario;
	 }
	
	 @Override
		public String toString() {
		 return super.toString() +
			"\n"
			+ ""
			+ "Numero de registro sanitario :  "+this.numeroRegistroSanitario;
		}	
		
}
