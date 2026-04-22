package servicio;

import dao.ClienteDAO;
import modelo.Cliente;

public class LoginService {

    private ClienteDAO dao = new ClienteDAO();

    public Cliente iniciarSesion(String email) {
        return dao.login(email);
    }
}