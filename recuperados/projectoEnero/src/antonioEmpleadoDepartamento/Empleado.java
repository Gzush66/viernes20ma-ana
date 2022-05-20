package antonioEmpleadoDepartamento;

public class Empleado {

	
		
		private String nombre;
		
		/*atributos que surgen de implementar las 3 asociaciones
		 *  -Empleado trabaja en departamento
		 *  -Empleado dirige un departamento
		 *  -Empleado es jefe de Empleado */
		private Empleado jefe; //el jefe de ese empleado
		private Empleado subordinado; //el subordinado de ese empleado
		private Departamento departamento; //el depto de ese empleado

		/*por eleccion no pondremos esta vble xq normalmente un empleado
		 * no dirige un departamento y estaría vacía casi siempre */
		//private Departamento departamentoDirigido;
		
		//constructor
		public Empleado(String nombre, Departamento departamento) {
			this.nombre = nombre;
			this.jefe = null;
			this.subordinado = null;
			this.departamento = departamento;
		}
		
		@Override
		public String toString() {
			
			String nombreJefe = "<vacío>";
			if(this.jefe != null) {
				//solo accedemos al objeto jefe si no es nulo
				nombreJefe = this.jefe.getNombre();
			}
			String nombreSubord = "<vacío>";
			if(this.subordinado != null) {
				//solo accedemos al objeto subordinado si no es nulo
				nombreSubord = this.subordinado.getNombre();
			}
			String nombreDepart = "<vacío>";
			if(this.departamento != null) {
				//solo accedemos al objeto departamento si no es nulo
				nombreDepart = this.departamento.getNombre();
			}
			String aux =("*****************************");
			aux = aux.concat("\nEMPLEADO: "+this.nombre);
			aux = aux.concat("\n Tiene de jefe a: "+nombreJefe);
			aux = aux.concat("\n Es jefe de: "+nombreSubord);
			aux = aux.concat("\n Departamento: "+nombreDepart);
			
			return aux;
		}
		
		//getters y setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Empleado getJefe() {
			return jefe;
		}

		public void setJefe(Empleado jefe) {
			this.jefe = jefe;
		}

		public Empleado getSubordinado() {
			return subordinado;
		}

		public void setSubordinado(Empleado subordinado) {
			this.subordinado = subordinado;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		
		
	}
