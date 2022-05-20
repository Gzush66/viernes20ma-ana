package mitoDAO;
import java.util.List;

public interface PersonaDAO {
	List<Persona>listarTodos();
	Persona leerPorId (int id);
	void registrar (Persona persona);
	void actualizar (Persona persona);
	void eliminar (int id);

}
