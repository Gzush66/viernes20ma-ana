package ejercicioCincoPuntoTresUno;

public class Fresco extends Producto {

		String fechaEnvasado, paisOrigen ;
		
		public Fresco (String nombre,int lote, String caducidad,String fechaEnvasado, String paisOrigen) {			
			super (nombre,lote,caducidad);
			this.paisOrigen=paisOrigen;
			this.fechaEnvasado=fechaEnvasado;		
			
		}
		
		public void setPaisOrigen(String pais) {
			this.paisOrigen= pais;
		}
		public String getPaisOrigen () {
			return paisOrigen;
		}
		
		public void setEnvasado(int day,int month,int year) {
			this.fechaEnvasado=fechaEnvasado;			
		}
		
		@Override
		public String toString() {
			return super.toString() +
			
			"\nPais de origen :  "+this.paisOrigen+"\n"+
			"Fecha de envasado :  "+this.fechaEnvasado;
		}
		
		/*public String toString() {
			return super.toString() //se llama al método del padre aprovechándolo
			+ "Raza: " + this.raza //y se le añade información después
			+ "\n*************************\n";
			}*/
		
		
	}
