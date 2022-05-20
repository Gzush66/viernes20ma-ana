package pildorasInformaticasEjercicios;

public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]matrix01=new int[4][5];
		int [][]matrix002= {
				{10,20,52,41,41},
				{22,44,1,5,7},
				{150,420,522,41,41},
				{22,44,25,85,77},
		};
		
		for (int[]fila:matrix002) {
			System.out.println();
			for (int z:fila) {
				System.out.print(z + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		for (int[]rellenar:matrix002) {
			System.out.println();
			for(int z : rellenar) {
				System.out.print(z + " ");
			}
		}
		
		/*for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(matrix002[i][j]);
				System.out.println();;
			}
		}   */

	}

}
