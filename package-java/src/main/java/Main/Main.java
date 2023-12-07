package Main;

import dao.UsuarioDao;

public class Main {
    public static void main(String[] args) {
        UsuarioDao usuarioDao = new UsuarioDao();

        usuarioDao.cadastrarUsuario("Caio", "Caio@gmail.com", "caio123");
    }
}
