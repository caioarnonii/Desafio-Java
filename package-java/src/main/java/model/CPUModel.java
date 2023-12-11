package model;

import com.github.britooo.looca.api.core.Looca;

public class CPUModel extends ComponenteModel{

    @Override
    public double obterUso() {
        double monitoramento = new Looca().getProcessador().getUso();
        this.monitoramento = monitoramento;
        return monitoramento;
    }
}
