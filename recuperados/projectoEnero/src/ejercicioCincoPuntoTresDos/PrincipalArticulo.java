
package ejercicioCincoPuntoTresDos;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *public Articulo (Dinero precio,String nombre,int stock) { */
		 
		
		Articulo oferta[]=new Articulo[3];
		oferta[0]=new Articulo(new Dinero(60),"bidon parafina",120);
		oferta[1]=new Articulo(new Dinero(80),"botas",45);
		oferta[2]=new Articulo(new Dinero(90),"cargador rapido",110);
		
		for (int i=0; i< oferta.length ; i++) {
			System.out.println(oferta[i]);
		}
		System.out.println();
		
		System.out.println("Actualiza el precio de las Botas:");
		Scanner sc=new Scanner (System.in);
		 
		int aux=sc.nextInt();
		oferta [1].getPrecio().setCantidad(aux);
		System.out.println(oferta[1]);
		
	}

}


