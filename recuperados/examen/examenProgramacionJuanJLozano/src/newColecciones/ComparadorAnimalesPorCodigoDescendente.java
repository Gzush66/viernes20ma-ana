package newColecciones;

import java.util.Comparator;

public class ComparadorAnimalesPorCodigoDescendente 
	implements Comparator<Animal>{

	@Override
	public int compare(Animal a1, Animal a2) {
		return a2.getCodigo() - a1.getCodigo();	
	}

}
