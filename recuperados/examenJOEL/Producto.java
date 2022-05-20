package Trimestre3.Examen22_04_2022;

public class Producto {

	private String nombre;
	private int codigo;
	private String pais;
	private float precio;
	
	public Producto(String nombre, String pais, int codigo, float precio) {
		
		this.nombre = nombre;
		this.pais = pais;
		this.codigo = codigo;
		this.precio = precio;
		
		
	}
	
	public boolean esValido() {
		
		return (nombre !=null && pais != null && codigo >= 0 && precio > 0);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public boolean equals(Object obj) {
		Producto p = (Producto)obj;
		if(p.hashCode() == this.hashCode()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int resultado = codigo+(int)precio;
		String nombreMasPais = nombre + " " + pais;
		for(int i = 0; i < nombreMasPais.length(); i++) {
			resultado += (int)nombreMasPais.charAt(i)*i;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		
		return"Nombre:" + nombre + "\nPais:" + pais + "\nCodigo:" + codigo + "\nPrecio:" + precio + "\n";
	}
}
