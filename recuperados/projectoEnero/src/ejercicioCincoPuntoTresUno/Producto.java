package ejercicioCincoPuntoTresUno;
import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;

public abstract class Producto {
	
	protected String nombre;
	protected int lote;
	
	String caducidad= "25/11/2023";	
	
	public   Producto (String nombre,int lote, String caducidad) {
		this.nombre=nombre;
		this.lote=lote;
		this.caducidad=caducidad;		
	}	
	
	public String getNombre() {
		return nombre;
	}
	public int getLote() {
		return lote;
	}
	
	@Override
	public String toString() {
		return "\nProducto: "+this.nombre+"\n"+
		"Fecha caducidad: "+this.caducidad  +"\n"+
		"Numero de lote :"+this.lote;
	}
	
	
	
	}
/*public String getCaducidad () {
int day= caducidad.getDate();
int month=caducidad.getMonth();
int year=caducidad.getYear();
return day+"/"+month+"/"+year;
}*/


//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//Date fecha = sdf.parse("10/09/2007");
	//Date caducidad = new Date();
  //String strDateFormat = "yyyy-MM-dd ";
  //SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
 // System.out.println(sdf.format(date));

