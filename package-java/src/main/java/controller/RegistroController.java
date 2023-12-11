package controller;

import dao.RegistroDAO;
import model.ComponenteModel;

public class RegistroController {
    public boolean cadastrarMonitoramento(ComponenteModel componenteModel){
        RegistroDAO registroDAO = new RegistroDAO();

        // Números de Linhas Afetadas Deve ser Maior que 0
        return registroDAO.cadastrarRegistro(componenteModel) > 0;
    }
}
