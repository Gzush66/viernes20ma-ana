package ejercicioCincoPuntoCuatro;

public class Pelo {

	private String color;
	private LongitudPelo longitud;
	private FormaPelo forma;
	
	public Pelo(LongitudPelo longitud, FormaPelo forma,String color) {
		this.longitud= longitud;
		this.forma= forma;
		this.color=color;
	}
	
	public String  getColor () {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public FormaPelo getForma() {
		return this.forma;
	}
	
	public void setForma(FormaPelo forma) {
		this.forma=forma;	
	}
	
	public LongitudPelo getLargo() {
		return this.longitud;
	}
	
	
	
	public void setLargo(LongitudPelo longitud) {
	this.longitud=longitud;
	}


}
