package examenJuanJesusLozanoMorenoEXAMEN6B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		

		Producto p1 = new Producto("Patata", 100, "España", 50);
		Producto p2 = new Producto("Tomate", 101, "Marruecos", 40);
		Producto p3 = new Producto("Mermelada", 104, "Inglaterra", 50);
		Producto p4 = new Producto("Mostaza", 105, "Francia", 59);
		Producto p5 = new Producto("Aguardiente", 200, "Italia", 102);
		Producto p6 = new Producto("Polvoron", 105, "España", 70);
		Producto p7 = new Producto("Harina", 108, "Ucrania", 35);
		Producto p8 = new Producto("Vino", 201, "Francia", 95);
		Producto p9 = new Producto("Papel", 602, "China", 35);
		Producto p10 = new Producto("Bolsa", 607, "China", 15);
		
		
		
		
		
		
		
		HashSet<Producto> almacenHash = new HashSet<>();
		almacenHash.add(p1);
		almacenHash.add(p10);
		almacenHash.add(p9);
		almacenHash.add(p8);
		almacenHash.add(p7);
		almacenHash.add(p6);
		almacenHash.add(p5);
		almacenHash.add(p4);
		almacenHash.add(p3);
		almacenHash.add(p2);
		almacenHash.add(p1);
		almacenHash.add(p8);
		almacenHash.add(p7);
		almacenHash.add(p6);
		
		for (Producto aux : almacenHash) {
			System.out.println("contenido del almacenHash\n");
			System.out.println(aux);			
		}
		
	
		 // 1) eliminar todos los elementos que tengan un determinado país
		
		System.out.println("introduce pais:");
		Iterator<Producto> it = almacenHash.iterator();
		while (it.hasNext()) {
			if (it.next().getPais().equals(sc.nextLine())){  
				System.out.println("Se ha encontrado una coincidencia");
				it.remove();
			}

		}
		
		for (Producto aux : almacenHash) {
			System.out.println("Despues de borrar contenido del almacenHash\n");
			System.out.println(aux);			
		}
		
		// 2) eliminar el último producto cuyo nombre coincida con el que se le pase a la función 
		
		LinkedHashSet<Producto>listaLink=new LinkedHashSet<>();
		for (Producto auxiliar : almacenHash) {
			listaLink.add(auxiliar);
		}
		
		
		
		System.out.println("Introduzca nombre a eliminar:");
		Iterator<Producto>it2= listaLink.iterator();
		while(it2.hasNext()) {
			if(it2.next().getNombre().equals(sc.nextLine())) {
				System.out.println("Encontrado identico nombre");
				it2.remove();
				
			}
		}
		
		//3) eliminar duplicados
		
		
		
		
		
		
		
		
	}
}
		
		
		

		
		
		
		
		

	