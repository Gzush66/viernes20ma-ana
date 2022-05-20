package vierneslinkedList;
import java.util.HashSet;

import java.util.HashMap;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Animal a1= new Animal("gato",1);
		Animal a2= new Animal("gato",2);
		Animal a3= new Animal ("perro",1);
		Animal a4= new Animal ("perro",3);
		Animal a5=new Animal ("perro",3);
		
		
		System.out.println("a1 es igual a a2  "+ a1.equals(a2));
		System.out.println("a1 es igual a a3  "+ a1.equals(a3));
		System.out.println("a2 es igual a a3  "+ a2.equals(a3));
		
		
		//ArrayList<Animal>animales = new ArrayList<>();
		HashSet <Animal>animales = new HashSet <>();
		
		animales.add(a1);
		animales.add(a2);
		animales.add(a3);
		animales.add(a4);
		animales.add(a5);
		//System.out.println(animales);
		
		for (Animal animal : animales) {
			System.out.println(animal + "HashCode"+ animal.hashCode());
		}
		

	}

}
