package servicio;

import dao.ClienteDAO;
import dao.MovilDAO;
import modelo.Cliente;
import modelo.Movil;

import java.util.List;

public class CatalogoService {

    private ClienteDAO clienteDAO = new ClienteDAO();
    private MovilDAO movilDAO = new MovilDAO();

    public Cliente login(String email, String password) {
        return clienteDAO.login(email, password);
    }

    public List<Movil> obtenerCatalogo() {
        return movilDAO.obtenerTodos();
    }
}