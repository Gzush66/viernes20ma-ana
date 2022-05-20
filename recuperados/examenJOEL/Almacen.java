package Trimestre3.Examen22_04_2022;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Almacen {

	private ArrayList<Producto> productos = new ArrayList<>();

	public void insertarProducro(Producto producto) {
		if (producto != null && producto.esValido()) {
			productos.add(producto);
		} else {
			System.err.println("Lo siento no puedes insertar productos nulos o con campos no especificados.\nPara que un Producto sea valido tiene que cumplir las siguientes condiciones \nCodigo igual a 0 o mayor, precio mayor que 0, y en el nombre y pais especificar alguno");
		}
	}

	public void eliminarProductoSegunPais(String pais) {
		if (pais != null) {
			productos.removeIf(producto -> producto.getPais().equalsIgnoreCase(pais));
		} else {
			System.err.println("Para eliminar un producto segun el pais, debes especificar un pais valido.");
		}
	}

	public void eliminarUltimoProductoInsertadoConNombreEspecifico(String nombre) {
		if (nombre != null) {
			for (int i = productos.size() - 1; i >= 0; i--) {
				if (productos.get(i).getNombre().equals(nombre)) {
					productos.remove(i);
					break;
				}
			}
		} else {
			System.err.println("Para eliminar el ultimo Producto insertado con un nombre, primero debes insertar un nombre valido.");
		}
	}

	public void eliminarDuplicados() {
		Set<Producto> productosSinDuplicados = new LinkedHashSet<>(productos);
		productos.clear();
		productos.addAll(productosSinDuplicados);

	}

	public void eliminarDuplicadosYOrdenarPorNombre() {
		eliminarDuplicados();
		productos.sort(Comparator.comparing(Producto::getNombre));
	}

	public void mostrarSumaPrecioOrdenados(EnumMetodoOrdenacion m) {
		if (m != null) {
			ArrayList<Entry<Integer, Float>> sumaPreciosCodigo = new ArrayList<>(
					buscadordeproductosporcodigo().entrySet());
			if (m.equals(EnumMetodoOrdenacion.POR_CODIGO_ASC)) {
				sumaPreciosCodigo.sort(Comparator.comparing(Entry<Integer, Float>::getKey));

			} else if (m.equals(EnumMetodoOrdenacion.POR_PRECIO_DESC)) {
				sumaPreciosCodigo.sort(Comparator.comparing(Entry<Integer, Float>::getValue).reversed());
			}
			sumaPreciosCodigo.forEach(pareja -> {
				System.out.println("Codigo:" + pareja.getKey() + "\nSuma Precios:" + pareja.getValue() + "\n");
			});
		} else {
			System.err.println("Debes elegir un metodo de ordenacion valido.");
		}
	}

	private Map<Integer, Float> buscadordeproductosporcodigo() {
		HashMap<Integer, Float> preciosPorCodigo = new HashMap<>();
		productos.forEach(producto -> {

			if (!preciosPorCodigo.keySet().contains(producto.getCodigo())) {
				preciosPorCodigo.put(producto.getCodigo(), producto.getPrecio());
			} else {
				preciosPorCodigo.put(producto.getCodigo(),
						preciosPorCodigo.get(producto.getCodigo()) + producto.getPrecio());
			}

		});
		return preciosPorCodigo;
	}

	@Override
	public String toString() {
		String resultado = "";

		for (Producto pr : productos)
			resultado += pr + "\n";
		return resultado;
	}

}
