package controller;

import dao.ComponenteDAO;
import model.ComponenteModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ComponenteController {
    private static List<ComponenteModel> listaComponentes = new ArrayList<>();
    public static Logger log = LogManager.getLogger(ComponenteController.class);


    public void listarComponentes(){
        ComponenteDAO componenteDAO = new ComponenteDAO();

        listaComponentes = componenteDAO.listarComponentes();
    }

    public void monitorarComponentes(){
        listaComponentes.forEach(componenteModel -> {
            componenteModel.obterUso();
            log.info(componenteModel);

            RegistroController registroController = new RegistroController();
            registroController.cadastrarMonitoramento(componenteModel);
        });
    }

}
