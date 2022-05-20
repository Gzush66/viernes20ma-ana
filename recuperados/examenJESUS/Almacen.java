package examenJuanJesusLozanoMorenoEXAMEN6B;

import java.util.ArrayList;
public  class Almacen {
	
	private ArrayList<Producto>listaProductos=new ArrayList<>();
	
	public   void insertarProducto(Producto producto) {
		listaProductos.add(producto);
	}
	
	public void eliminarPorPais(String pais) {
		System.out.println("introduce pais:");
		Iterator<Producto> it = listaProductos.iterator();
		while (it.hasNext()) {
			if (it.next().getPais().equals(sc.nextLine())){  
				System.out.println("Se ha encontrado una coincidencia");
				it.remove();
			}

	}
	}
		
		public void eliminarPorNombre(String nombre) {
			System.out.println("Introduzca nombre a eliminar:");
			Iterator<Producto>it2= listaProductos.iterator();
			while(it2.hasNext()) {
				if(it2.next().getNombre().equals(sc.nextLine())) {
					System.out.println("Encontrado identico nombre");
					it2.remove();
					
				}
			}
		}
		
		public void eliminarUltimoProductoInsertadoConNombreEspecifico(String nombre) {
			
				for (int i = listaProductos.size() - 1; i >= 0; i--) {
					if (productos.get(i).getNombre().equals(nombre)) {
						productos.remove(i);
						break;
					}
				}
			}
		
		
		
		
		}
	
	/*public void insertarProducro(Producto producto) {
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
	*	
	*/
	
	
	
		
		
		
		
		
		
		
		/*listaProducto.add(p1);
		listaProducto.add(p2);
		listaProducto.add(p4);
		listaProducto.add(p10);
		listaProducto.add(p9);
		listaProducto.add(p8);
		listaProducto.add(p6);
		listaProducto.add(p7);
		listaProducto.add(p5);
		listaProducto.add(p3);
		
		*/
		
		 
		 
		 
		
		
		
		
	   
		
		
		
		
		
		
		
	
