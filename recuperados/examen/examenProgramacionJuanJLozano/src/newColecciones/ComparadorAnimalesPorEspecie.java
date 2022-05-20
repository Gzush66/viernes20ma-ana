package newColecciones;

import java.util.Comparator;

public class ComparadorAnimalesPorEspecie 
	implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) {		
		return a1.getEspecie().compareTo(a2.getEspecie());	
	}

}
