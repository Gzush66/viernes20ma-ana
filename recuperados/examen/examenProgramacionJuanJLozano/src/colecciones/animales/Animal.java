package seispuntodos;

public class Animal {
	
		//CREO UN ENUMERACION. el objeto sexo es de la clase Sexo	
	 //private Sexo sexo;
	//	 pongo protected para que la puedan ver sus hijos
	//protected Sexo sexo;
	protected Sexo sexo;	

	 
	 	//constructor, se le pasa sexo
	 public Animal (Sexo sexo) {
		 this.sexo= sexo;
		 System.out.println("constructor con 1 parametro");
		 
	 }
	 
	 // SI NO LE PASO NADA ES HEMBRA POR DEFECTO. Declaramos que de primeras sera hembra
	 
	 public Animal() {
		 this.sexo= Sexo.HEMBRA;				 
	 }
	 
	 public void setSexo(Sexo sexo) {
		 this.sexo = sexo;
	 }
	 public Sexo getSexo() {
		 return sexo;
	 }

	 	public void duerme() {
	 		System.out.println("Zzzz Zzzzz");
	 	}
	 	
	 	
	 	public void ronronea() {
	 		System.out.println("rrrrrrrr");
	 	}
	 	
	 	public void pelea(Animal adversario) {
	 		if(this.sexo==sexo.HEMBRA) {			//si el animal es hembra no pelea
	 			System.out.println("soy chica, yo no peleo");
	 			}else {
	 			if(adversario.sexo==Sexo.HEMBRA)	{//si el adversario es hembra no se pelea con ella
	 		}else {
	 		System.out.println("Zas en toda la boca!!!!");
}
}
	 	
	 	}
	 	@Override
	 	public String toString () {
	 		return "Sexo:" + this.sexo;
	 	}
	 	
	 	
}
