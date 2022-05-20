package Trimestre3.Examen22_04_2022;

public class Principal {

	public static void main(String[] args) {
		
		
		Almacen al = new Almacen();
		

		al.insertarProducro(new Producto("Agua","Espana",1,1.50F));
		al.insertarProducro(new Producto("Hoja de Papel","Espana",2,1.75F));
		
		al.insertarProducro(new Producto("CocaCola","Alemania",3,1.75F));
		al.insertarProducro(new Producto("Mesa","Alemania",4,1.75F));
		
		al.insertarProducro(new Producto("Torre","Alemania",5,2.75F));
		al.insertarProducro(new Producto("CocaCola","Alemania",3,1.75F));
		al.insertarProducro(new Producto("CocaCola","Alemania",6,1.75F));

		al.insertarProducro(new Producto("Agua","Estados unidos",3,2.0F));

		
		al.eliminarProductoSegunPais("espana");
		
		al.eliminarUltimoProductoInsertadoConNombreEspecifico("CocaCola");
		System.out.println(al);
		System.out.println();
		System.out.println();
		System.out.println();

		al.eliminarDuplicados();
		al.eliminarDuplicadosYOrdenarPorNombre();
		
		System.out.println(al);
		al.insertarProducro(new Producto("Lampara","Alemania",4,9.0F));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ORDENADA POR CODIGO ASC");
		al.mostrarSumaPrecioOrdenados(EnumMetodoOrdenacion.POR_CODIGO_ASC);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("ORDENADA POR PRECIO DESC");
		
		al.mostrarSumaPrecioOrdenados(EnumMetodoOrdenacion.POR_PRECIO_DESC);




	}
	
}
