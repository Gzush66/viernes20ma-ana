package juanJesusLozanoMorenoExamenPOO;

public class Asignatura {
	
	String titulo,codigo;
	 Asignatura[]asignatura;
	
	public Asignatura(String titulo,String codigo) {
		this.titulo=titulo;
		this.codigo=codigo;
	}
	/*Asignatura[]clase=new Asignatura[String titulo,String codigo];*/
	
	public  String getTitulo() {
		return titulo;
	}
	public  String getCodigo() {
		return codigo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	

}


