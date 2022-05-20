package despegandoOxido;
import java.util.Scanner;
public class Buscaminas01001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("introduzca fila");		//filas
		int fila1=sc.nextInt();
		System.out.println("introduzca columnas");		//columnas
		int col1=sc.nextInt();
		
		int tablero[][]=new int [fila1][col1];
		for (int i=0;i<tablero.length; i++)	{
			for (int j=0; j<tablero[i].length ;j++)	{
				tablero[i][j]=(int)(Math.random()*( (fila1*col1)+1));	//relleno aleatorio
				System.out.print("\t"+tablero[i][j]+"\s\s");		//tablero hecho
			}System.out.println("\n");
			System.out.println();
		}
		
		int minas[][]=new int [fila1][col1];
		for (int i=1;i<=3;i++) {
			minas[fila1][col1]=(int)(Math.random()*( (fila1*col1)+1));
			System.out.print("\t"+minas[fila1][col1]+"\s\s");
		}
		
		
		
		/*
		for (int i=1; i<=3; i++)	{
			System.out.println("introduzca fila");		//fila buscando mina
			int fila3=sc.nextInt();
			System.out.println("introduzca columnas");		//columna buscando mina
			int col3=sc.nextInt();
			System.out.println("Intoduzca digito entre 0 y  "+(fila*col));
	coin=sc.nextInt();
	System.out.println(coin);
		}
		//System.out.println(coin);*/
}
}
