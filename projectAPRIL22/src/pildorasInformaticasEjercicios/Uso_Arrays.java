package pildorasInformaticasEjercicios;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=38;
		mi_matriz[2]=15;
		mi_matriz[3]=92;
		mi_matriz[4]=71;
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		System.out.println();
		System.out.println();
		
		for (int i=0;i<5;i++){
			System.out.println("valor del indice  " + i+" = " +mi_matriz[i]);
			
		}
		System.out.println();
		System.out.println();
		
		int[]matriz02= {10,20,52,36,541};
		for (int i=0;i<5;i++){
			System.out.println("valor del indice  " + i+" = " +matriz02[i]);
			
		}
		System.out.println();
		System.out.println();
		
		int[]matriz03=new int[10];
		for (int i=0;i<matriz03.length;i++){
			matriz03[i]=i;
			System.out.println(matriz03[i]);
		}
		
		
		
		
	}

}
