package seispuntoUnoDos;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class PrincipalArrayListAnimal {

	public static void main(String[] args) {

		ArrayList<Animal> arrayListAnimal = new ArrayList<Animal>();
		
		Animal a1=new Animal("pluto","perro");
		Animal a2=new Animal("miky","raton");
		Animal a3=new Animal ("tom","gato");
		Animal a4=new Animal ("silver","caballo");
		
		
		arrayListAnimal.add(a1);
		arrayListAnimal.add(a2);		
		arrayListAnimal.add(a3);
		arrayListAnimal.add(a4);
		//he de dividirlos pues si no, me da problemas en su salida por teclado
		Scanner scString = new Scanner(System.in);//para incorporar String
		Scanner scInt =new Scanner (System.in);//para incorporar int
		
		Animal animalSeleccionado = null;
		
		boolean salir = false;

		do {
			System.out.println("\n");
			System.out.println(" 1)Añadir elemento");
			System.out.println(" 2)Mostrar elemento en la posicon i");
			System.out.println(" 3)Mostrar todos los elementos");
			System.out.println(" 4)Seleccionar un elemento concreto en la pos i (servirá para la siguiente opción)");
			System.out.println(" 5)Modificar valores de ese elemento concreto");
			System.out.println(" 6)Eliminar elemento en la posición i");
			System.out.println(" 7)Eliminar último elemento insertado con un nombre concreto");
			System.out.println(" 8)Eliminar todos los elementos con un nombre concreto");
			System.out.println(" 9)Eliminar todos elementos mayores que el elemento seleccionado (según el nombre).");
			System.out.println(" 10)Eliminar todos elementos menores que el elemento seleccionado (según el nombre).");
			System.out.println(" 11)Salir");
			System.out.println("Itroduzca la opcion deseada: \n");
			
			int tamanio = arrayListAnimal.size();
			int opcion = scInt.nextInt();
			switch (opcion) {

			case 1:
				// añadir elemento
				
				System.out.println("hola");
				System.out.println("introduzca nombre animal:");
				String nombreAnimal = scString.nextLine();
				System.out.println("introduzca la especie: ");
				String especieAnimal = scString.nextLine();				
				Animal animal1 = new Animal(nombreAnimal, especieAnimal);
				arrayListAnimal.add(animal1);
				System.out.println(arrayListAnimal.size());
				break;
				
			case 2:
				// mostrar elemento en la posicion i
			
				System.out.println("seleccione indice a mostrar");
				int indiceMostrar = scInt.nextInt();
				if (indiceMostrar>=0 && indiceMostrar<tamanio) { // asegura que ese indice existe
					animalSeleccionado = arrayListAnimal.get(indiceMostrar);
					System.out.println(arrayListAnimal.get(indiceMostrar));
				} else {
					System.out.println("Vuelva a seleccionar otro indice:");
				}

				
				break;

			case 3:
				// mostrar todos los elementos

				for (int i = 0; i < tamanio; i++) {
					System.out.println("Nº "+i+arrayListAnimal.get(i));
				}
				break;

			case 4:
				// seleccionar un elemento concreto en la posicion i
				System.out.println("Introduzca un indice a seleccionar:");
				int indice = scInt.nextInt();
				
				if (indice>=0 && indice<tamanio) { // asegura que ese indice existe
					animalSeleccionado = arrayListAnimal.get(indice);			
					
				} else {
					System.out.println("Vuelva a seleccionar otro indice:");
				}
				
				break;

			case 5:
				// modificar valores de ese elemento concreto
				System.out.println("introduzca que nombre va a modificar:");
				String nombre = scString.nextLine();
				animalSeleccionado.setNombre(nombre);

				System.out.println("introduzca especie a modificar:");
				String especie = scString.nextLine();
				animalSeleccionado.setEspecie(especie);
				break;

			case 6: // Eliminar elemento en la posición i;

				System.out.println("introduzca indice a eliminar: ");
				int indice1 = scInt.nextInt();
				// animalSeleccionado=arrayListAnimal.get(indice1);
				// arrayListAnimal.remove(animalSeleccionado);
				// o lo que es lo mismo
				arrayListAnimal.remove(indice1);

				break;

			case 7:
				// Eliminar último elemento insertado con un nombre concreto
				System.out.println("introduzca el nombre concreto:");
				String nombreEliminar = scString.nextLine();				

				for (int i1 = tamanio-1; i1 >= 0; i1--) {					

					if (arrayListAnimal.get(i1).getNombre().equals(nombreEliminar)) {
						System.out.println("se va a proceder a eliminar el elemento "
								+ arrayListAnimal.get(i1).getEspecie() + "que coincide con el nombre indicado");
						arrayListAnimal.remove(i1);
						break;
					}
				}
				break;

			case 8:
				// Eliminar todos los elementos con un nombre concreto
				System.out.println("introduzca el nombre concreto:");
				String nombreConcreto = scString.nextLine();
				Iterator<Animal> it = arrayListAnimal.iterator();
				while (it.hasNext()) {
					if (it.next().getNombre().equals(nombreConcreto)) {
						it.remove();
					}
				}

				break;

			case 9:
				// Eliminar todos elementos mayores que el elemento seleccionado (según el
				// nombre)
				// igual que el 10 usando un compareTo, que creare

				Iterator<Animal> it1 = arrayListAnimal.iterator();
				while (it1.hasNext()) {
					if (it1.next().compareTo(animalSeleccionado) > 0) {
						it1.remove();
					}
				}

				break;

			case 10:
				// Eliminar todos elementos menores que el elemento seleccionado (según el
				// nombre

				Iterator<Animal> it2 = arrayListAnimal.iterator();
				while (it2.hasNext()) {
					if (it2.next().compareTo(animalSeleccionado) < 0) {
						it2.remove();
					}
				}
				break;

			case 11:
				System.exit(-1);
			break;
							
			}

		} while (!salir ); // while (!salir);

	}

}
