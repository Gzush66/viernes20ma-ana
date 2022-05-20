package ejercicioCincoPuntoTresDos;

public class Articulo {

	String nombre;
	Dinero precio;
	final float IVA = 1.21f;
	int stock;

	public Articulo(Dinero precio, String nombre, int stock) {
		this.precio = precio;
		this.nombre = nombre;
		this.stock = stock;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPrecio(Dinero precio) {
		this.precio = precio;
	}

	public Dinero getPrecio() {
		return precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public float getIva() {
		float pvp = this.precio.getCantidad() * IVA;
		return pvp;
	}

	public String obtenerDivisa() {
		String divisaObtenida = this.precio.getDivisa();
		return divisaObtenida;
	}

	@Override
	public String toString() {
		return "************************************" + "\n" + "nombre articulo : " + this.nombre + "\n" + "precio : "
				+ this.precio + "\n" + "IVA : 21%" + "\nPVP : " + getIva() + obtenerDivisa() + "\nstock disponible : "
				+ this.stock + "\s unidades.\n" + "************************************";
	}

}
