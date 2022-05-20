package mitoDAO;
import mitoDAO.PersonaDAO;
import mitoDAO.PersonaDAOImpl;

public class App {

	public static void main(String[] args) {
		PersonaDAO dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x ->System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("MitoCode");
		dao.registrar(per);
		

	}

}
