package seisPuntoDos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrincipalCarrera {

	public static void main(String[] args) {
		
		HashMap<Integer,String>carrera=new HashMap<>();
		
		carrera.put(100,"juan");
		carrera.put(101,"rosa");
		carrera.put(201, "luis");
		carrera.put(102, "jose");
		boolean salir=false;
		Scanner scString=new Scanner(System.in);
		Scanner scInt=new Scanner(System.in);
		Corredor corredorSeleccionado=null;	
		
		do { 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduzca la opcion deseada: \n");
		System.out.println("1)Añadir elemento (pareja de valores entero y cadena)");
		System.out.println("2)Mostrar elemento para un dorsal concreto ");
		System.out.println("3)Mostrar elemento(s) para un nombre concreto");
		System.out.println("4)Mostrar todos los elementos ");
		System.out.println(" 5)Modificar nombre de un dorsal concreto");
		System.out.println("6)Eliminar elemento con dorsal concret   ");
		System.out.println("7)Eliminar elemento(s) insertado con un nombre concreto   ");
		System.out.println("8)Salir \n");	
		
		
		int opcion=scInt.nextInt ();
		
		
		switch (opcion) {
		case 1:
			////1)Añadir elemento (pareja de valores entero y cadena) 
		
			System.out.println("Introduzca dorsal a introducir : ");
			Integer dorsal=scInt.nextInt();
			System.out.println("Introduzca nombre a introducir : ");			
			String nombre=scString.nextLine();
			
			carrera.put(dorsal,nombre);	
			/*
			//vamos a mostrar lo que hay hasta ahora
			for (Map.Entry pareja : carrera.entrySet()) {
				System.out.println(pareja);
			}	*/		
			break;
		
		case 2:
			//2)Mostrar elemento para un dorsal concreto 
			
			System.out.println("introduzca el dorsal a buscar :");
			dorsal=scString.nextInt();
			System.out.println("  El dorsal :  "+dorsal+ "\n corresponde a :  "+(carrera.get(dorsal)));
			
			
			break;
			
		case 3:
			//3)Mostrar elemento(s) para un nombre concreto
			System.out.println("introduzca el nombre :");
			String nombreConcreto=scString.nextLine();
			if (carrera.containsValue(nombreConcreto)) {
				for (Entry<Integer,String> pareja:carrera.entrySet()) {
				//el Map.Entry me daba problemas		
					System.out.println(pareja.getValue());
				
				break;
			}
			}
			break;
		case 4://Mostrar todos los elementos
		
			System.out.println("Los corredores son :\n");
			for (Map.Entry pareja : carrera.entrySet()) {
			//uso Map.Entry
				System.out.println(pareja);
			}
			break;	
			/*//Mostrar todos los elementos
			System.out.println("Mostrando todos los elementos");
			System.out.println();
			for (int i = 0; i < carrera.size(); i++) {
				System.out.println(carrera.get(i) +"\n");
			}
			System.out.println();
			break;*/
			
		case 5://modificar el nombre de un dorsal concreto
			System.out.println("Introduzca el dorsal a modificar:  ");
			int dorsalModify=scInt.nextInt();
			if (carrera.keySet().contains(dorsalModify)) {
				System.out.println("Introduzca nombre:  ");
				String newNombre=scString.nextLine();
				carrera.put(dorsalModify, newNombre);
			}else {
				System.out.println("Ese dorsal no existe, introduzca otro.");
			}
			
			break;
			
		case 6:
			//eliminar elemento con dorsal concreto
			
			System.out.println("Introduce que dorsal vas a eliminar:  ");
			int dorsalElim=scInt.nextInt();
			if(carrera.keySet().contains(dorsalElim)) {
				carrera.remove(dorsalElim);
			}else {
				System.out.println("ese dorsal no consta");
			}
			break;
			
		case 7://eliminar elemento insertado con un nombre concreto
			System.out.println("Introduce que nombre vas a a eliminar: ");
			String nombElim=scString.nextLine();
			Iterator<Integer> it = carrera.keySet().iterator();			
			while (it.hasNext()) {
				if (carrera.get(it.next()).equals(nombElim)) {
					it.remove();
				}				
			}
					
			break;
			
			case 8://salir
				salir=true;
				break;
			}
			
		} while (!salir );
		
	}
}
