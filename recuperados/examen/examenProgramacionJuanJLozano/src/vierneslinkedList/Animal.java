package vierneslinkedList;

	public class Animal {
		private String especie;
		private int codigo;
		
		private String marca;
		private String matricula;
		
		public Vehiculo (String marca, String matricula) {
		this. marca= marca;
		this.matricula= matricula;
		}

	public Animal(String especie, int codigo) {
			
			this.especie = especie;
			this.codigo = codigo;
		}



	@Override
	public boolean equals(Object o) {
		
		//son iguales si su especie es=
		boolean especieIgual = this.especie.equals( ( (Animal)o).especie);
		
		//son iguales si su codigo es=
		boolean codigoIgual = this.codigo == ((Animal)o).codigo;
		
		//son iguales si ambos son =
		boolean especieyCodigoIgual = 
		
		especieIgual && codigoIgual;
		
		return especieIgual;
	}
	@Override
	public int hashCode() {
		return especie.charAt(0);
	}
}