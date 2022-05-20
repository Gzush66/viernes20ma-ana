package departamento;

public class Departamento {

		
		private String nombre;
		
		/*atributos que surgen de implementar las 2 asociaciones
		 *  -Empleado trabaja en departamento
		 *  -Empleado dirige un departamento */
		private Empleado empleado; //el empleado de ese depto (solo 1)
		private Empleado director; //el director de ese depto (solo 1)
		
		//Constructor
		public Departamento(String nombre, Empleado director) {
			this.nombre = nombre;
			this.empleado = null; //no hace falta xq se le da el valor null por defecto
			this.director = director;
		}
		
		@Override
		public String toString() {
			String nombreDir = "<vacío>";
			if(this.director != null) {
				//solo accedemos al objeto director si no es nulo
				nombreDir = this.director.getNombre();
			}
			String nombreEmp = "<vacío>";
			if(this.empleado != null) {
				//solo accedemos al objeto empleado si no es nulo
				nombreEmp = this.empleado.getNombre();
			}
				
			String aux =    ("---------------------------");
			aux = aux.concat("\nDEPARTAMENTO: "+this.nombre);
			aux = aux.concat("\n Empleado: "+nombreEmp);
			aux = aux.concat("\n Director: "+nombreDir);
			aux = aux.concat("\n");
			
			return aux;
		}

		//getters y setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Empleado getEmpleado() {
			return empleado;
		}

		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}

		public Empleado getDirector() {
			return director;
		}

		public void setDirector(Empleado director) {
			this.director = director;
		}

	}