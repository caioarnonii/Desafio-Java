import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import threads.ListagemComponentesService;
import threads.MonitoramentoService;

import java.util.Timer;

public class App {
    public static Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Configurator.setRootLevel(Level.INFO);

        // Start Thread Services
        startServices();

    }

    private static void startServices(){
        Timer timer = new Timer();
        ListagemComponentesService listagemComponentesService = new ListagemComponentesService();
        MonitoramentoService monitoramentoService = new MonitoramentoService();

        timer.schedule(listagemComponentesService, 0, 10000);
        log.info("Thread de Listagem de Serviços Iniciada");

        timer.schedule(monitoramentoService, 10000, 2000);
        log.info("Thread de Monitoramento Iniciada");
    }
}
