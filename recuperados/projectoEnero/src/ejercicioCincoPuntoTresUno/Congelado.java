package ejercicioCincoPuntoTresUno;

public class Congelado extends Producto   {
	 
		
				private float tempCongelacion;	
				//String codNacional;
				String paisOrigen;
				
				CodNacion pegatina;
				
				public  Congelado(String nombre,int lote ,String caducidad, float tempCongelacion, String paisOrigen) {
					super (nombre,lote,caducidad);
					this.tempCongelacion=tempCongelacion;
					this.paisOrigen= paisOrigen;
				
					if (paisOrigen== "España") {
						pegatina= CodNacion.NACIONAL;						
				}else {
						pegatina=CodNacion.INTERNACIONAL;					     
					}					
				}
				
				
				
				public float getTempCong() {
				return this.tempCongelacion;
				}
				
				public void setTempCong (float tempCongelacion) {
				this.tempCongelacion=tempCongelacion;
				
				}
				
				 @Override
				 
				 
					public String toString() {
					 return super.toString() +"\n"+
						"Temperatura de congelacion optima :  "+this.tempCongelacion+"\n"+
						"Etiqueta de procedencia :  "+this.pegatina;
						 
					 }
					}
					
				/* String aux =("*****************************");
					aux = aux.concat("\producto : "+this.nombre);
					aux = aux.concat("\n Fecha de caducidad : "+this.caducidad );
					aux = aux.concat("\n Numero de lote : "+this.lote);
					aux = aux.concat ("\nTemperatura de congelacion optima :"+this.tempCongelacion+"\n"+
					aux = aux.concat ("\nEtiqueta de procedencia :"+ pegatina;
					return aux;
				}			
				 
				*/
	


