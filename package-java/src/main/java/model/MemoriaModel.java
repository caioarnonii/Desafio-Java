package model;

import com.github.britooo.looca.api.core.Looca;

public class MemoriaModel extends ComponenteModel {

    @Override
    public double obterUso() {
        double monitoramento = new Looca().getMemoria().getEmUso();
        monitoramento = monitoramento / (1024 * 1024 * 1024);
        this.monitoramento = monitoramento;
        return monitoramento;
    }
}