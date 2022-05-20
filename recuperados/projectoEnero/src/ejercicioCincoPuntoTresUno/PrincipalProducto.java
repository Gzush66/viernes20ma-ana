package ejercicioCincoPuntoTresUno;
import java.util.Scanner;

public class PrincipalProducto {

	public static void main(String[] args) {
		
	/*Scanner sc=new Scanner (System.in);
	System.out.println("Introduzca el producto :");
	String producto=sc.nextLine();
	System.out.println("Introduzca el lote del producto :");
	String lote=sc.nextLine();
	System.out.println("Introduzca la fecha de caducidad del producto :");
	String caducidad=sc.nextLine();
	System.out.println("Introduzca la fecha de envasado :");
	String envasado=sc.nextLine();
	System.out.println("introduzca el pais de origen :");
	String pais=sc.nextLine();
	System.out.println("Introduzca el Nº de Resgistro Sanitario :");
	int rss=sc.nextInt();
	System.out.println("Introduzca la Temperatura Optima de Congelacion : ");
	String  tempe=sc.nextLine();
	*/
					
		
					
	
	
	
	
	Fresco patata= new Fresco ("patata",001021,"25/10/2022","10/02/2022","españa");
	System.out.println(patata);
	Refrigerado boqueron=new Refrigerado("boqueron",001022,"25/10/2022",95204 );
	System.out.println(boqueron);
	Congelado fletan =new Congelado("fletan",001023,"25/10/2022",-25,"canada");
	System.out.println(fletan);
	
			
		
	
		
		
		
		
	}
}
