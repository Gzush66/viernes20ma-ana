package Figuras;



	public abstract class Figura01
	{
	protected double x;
	protected double y;
	public Figura01 (double x, double y)
	{
	this.x = x;
	this.y = y;
	}
	public abstract double area (); //No se ha definido
	}
	public class Circulo extends Figura
	{
	private double radio;
	public Circulo (double x, double y, double radio)
	{
	super(x,y);
	this.radio = radio;
	}
	public double area ()
	{
	return Math.PI*radio*radio;
	}
	}
	public class Cuadrado extends F
	
	
	
}
