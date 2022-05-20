package coleccionesPruebaSet;

import java.util.Comparator;

public class ComparadorAnimalesPorCodigo implements Comparator <Animal>{

	@Override
	public int compare(Animal a1,Animal a2) {
		// TODO Auto-generated method stub
		return this.especie.compareTo(otroAnimal.especie);
		return 0;
	}
	

}
