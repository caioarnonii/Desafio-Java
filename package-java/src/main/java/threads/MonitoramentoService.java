package threads;

import controller.ComponenteController;

import java.util.TimerTask;

public class MonitoramentoService extends TimerTask {
    private static final ComponenteController componenteController = new ComponenteController();

    @Override
    public void run() {
        componenteController.monitorarComponentes();
    }
}
