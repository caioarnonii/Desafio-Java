package model;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Volume;

public class DiscoModel extends ComponenteModel{

    @Override
    public double obterUso() {
        Volume volumePrincipal = new Looca().getGrupoDeDiscos().getVolumes().get(0);
        double monitoramento = 100 - ((double) volumePrincipal.getDisponivel() / (1024 * 1024 * 1024));
        this.monitoramento = monitoramento;
        return monitoramento;
    }
}
