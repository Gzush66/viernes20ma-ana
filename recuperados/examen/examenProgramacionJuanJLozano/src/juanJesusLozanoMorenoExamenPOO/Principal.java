package juanJesusLozanoMorenoExamenPOO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*		notas para los constructores
		 * Profesor(String nombre,String dni,int salario,Asignatura asignatura){
		 *  Pas(String nombre,String dni,int salario){ 
		 *  Estudiante(String nombre,String dni,Asignatura  asignatura){ 
		 *  Emerito(String nombre,String dni,int salario,Asignatura asignatura) {
		 * Asignatura(String titulo, String codigo){
		 */

		
		
		Profesor saturnino= new Profesor("saturnino","123000",12000, "InformB8547","informatica de gestion");
		Pas agustin=new Pas("agustin","123001",10500);
		Estudiante=new Estudiante("Carmela","123002","InformB8547","informatica de gestion");//no esta bien pues ha de escoger dos asignaturas
		Emerito fermin=new Emerito("Fermin","123005",11000,"Biotech0254","biotecnologia");
		Asignatura biotecnologia=new Asignatura("Biotech0254","biotecnologia");
	}

}
