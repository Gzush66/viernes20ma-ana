package coleccionesPruebaSet;

		import java.util.HashSet;
		import java.util.LinkedHashSet;

		public class PruebaSet {

			public static void main(String[] args) {
				Animal a1 = new Animal("gato",1);
				Animal a2 = new Animal("gato",2);
				Animal a3 = new Animal("perro",1);
				Animal a4 = new Animal("perro",3);
				Animal a5 = new Animal("perro",3);
				
				System.out.println("\nComparación de objetos:");
				System.out.println("a1 es igual a a2:"+a1.equals(a2));
				System.out.println("a1 es igual a a3:"+a1.equals(a3));
				System.out.println("a2 es igual a a3:"+a2.equals(a3));
				System.out.println("a4 es igual a a5:"+a4.equals(a5));
				System.out.println("a4 es igual a a4:"+a4.equals(a4));

				/*el set considera que dos objetos son iguales
				cuando se cumple a la vez que:
				-El metodo equals devuelve true
				-El metodo hashCode devuelve el mismo entero
				*/		
				System.out.println("\nValor de los códigos hash:");
				System.out.println("Código hash de a1:"+a1.hashCode());
				System.out.println("Código hash de a2:"+a2.hashCode());
				System.out.println("Código hash de a3:"+a3.hashCode());
				System.out.println("Código hash de a4:"+a4.hashCode());
				System.out.println("Código hash de a5:"+a5.hashCode());
				
				//Creamos un hashSet
				HashSet<Animal> animales = new HashSet<>();
				animales.add(a1);
				animales.add(a2);
				animales.add(a3);
				animales.add(a4);
				animales.add(a5);
						
				//imprimo el contenido del conjunto 
				System.out.println("\nContenido del HashSet (SIN ORDEN):");
				for(Animal animal : animales) {
					System.out.println(
						animal + " HahsCode:"+ animal.hashCode());
				}

				// Creamos un LinkedHashSet
				LinkedHashSet<Animal> animalesPorOrdenInsercion = 
						new LinkedHashSet<>();
				animalesPorOrdenInsercion.add(a1);
				animalesPorOrdenInsercion.add(a2);
				animalesPorOrdenInsercion.add(a3);
				animalesPorOrdenInsercion.add(a4);
				animalesPorOrdenInsercion.add(a5);

				// imprimo el contenido del conjunto
				System.out.println("\nContenido del LinkedHashSet "
						+ "(POR ORDEN DE INSERCION):");
				for (Animal animal : animalesPorOrdenInsercion) {
					System.out.println(animal + 
						" HahsCode:" + animal.hashCode());
				}
			}

		}