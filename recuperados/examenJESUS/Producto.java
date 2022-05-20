package examenJuanJesusLozanoMorenoEXAMEN6B;

import java.util.Objects;

public class Producto {
	private String nombre;
	
	private Integer codigo;
	private String pais;
	private Integer precio;
	
	public Producto(String nombre,Integer codigo,String pais, Integer precio) {
		this.nombre=nombre;
		this.codigo=codigo;
		this.pais=pais;
		this.precio=precio;		
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getPais() {
		return pais;
	}

	public Integer getPrecio() {
		return precio;
	}

	@Override
	public int hashCode() {
		return codigo.hashCode();
		//return Objects.hash(codigo, nombre, pais, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		
		return Objects.equals(codigo, other.codigo) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(pais, other.pais) && Objects.equals(precio, other.precio);
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", pais=" + pais + ", precio=" + precio + "]";
	}

}
