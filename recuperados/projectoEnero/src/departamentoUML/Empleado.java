package departamentoUML;

public class Empleado {
	
	//el empleado tiene un nombre
		private String nombre;
	//el empleado tiene unos atributos	
		private Empleado jefe;
		private Empleado subordinado;
		private Departamento departamento;
		
		
		
	//por eleccion no pondremos esta 
	//xq normalmente un empleado no direge un departamento 
	//y estaria vacia casi siempre vacia
		
		//private Departamento departamentoDirigido;

	//metodo constructor
				public Empleado (String nombre , Departamento departamento) {
			this.nombre = nombre;				
			this.jefe = null;
			this.subordinado = null;
			this.departamento = departamento;
		}
			
				
				@Override
				public String toString() {
					String nombreJefe = "<vacio>";
					//if (this.director != null) {
					String aux = ("....................");
					aux = aux.concat("\n EMPLEADO:  "+this.nombre);
					aux = aux.concat("\n Es jefe de:  "+this.subordinado);
					aux = aux.concat("\n Tiene de jefe a :  "+this.jefe);					
					aux = aux.concat("\n Departamento:  "+this.departamento);
					return aux;
				}
				
				
				
				
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		public void setDepartamenteo(Departamento departamento) {
			this.departamento=departamento;
		}
		public void setJefe(Empleado jefe) {
			this.jefe=jefe;
		}
		
		public void setSubordinado(Empleado subordinado) {
			this.subordinado=subordinado;
		}
		
		
		public String getNombre() {
			return this.nombre;
		}
		
		public Empleado getJefe() {
			return this.jefe;			
		}
		public Empleado getSubordinado() {
			return this.subordinado;
		}
		public Departamento  getDepartamento() {
			return this.departamento;
		}
	
		
		// TODO Auto-generated method stub

	}


