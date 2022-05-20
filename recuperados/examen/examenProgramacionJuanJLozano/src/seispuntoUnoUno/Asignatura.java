package seispuntoUnoUno;

public class Asignatura {
	private static final String CODIGO_VACIO = "-1";
	private static final String NOMBRE_VACIO = "<vacío>";
	private String titulo;
	private String codigo;
	
	public Asignatura (String titulo, String codigo) {
		this.titulo = titulo;
		this.codigo = codigo;
	}
	
	//asignatura por defecto
	public Asignatura () {
		this(NOMBRE_VACIO,CODIGO_VACIO);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String toString() {
		String aux = (this.titulo + " cuyo codigo es " + this.codigo);
		return aux;
	}
}
