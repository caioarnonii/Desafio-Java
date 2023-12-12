package model;

import utils.Monitoravel;

public abstract class ComponenteModel implements Monitoravel {

    private int idComponente;
    private String nome;
    private String unMedida;
    protected Double monitoramento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnMedida() {
        return unMedida;
    }

    public void setUnMedida(String unMedida) {
        this.unMedida = unMedida;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public Double getMonitoramento() {
        return monitoramento;
    }

    public void setMonitoramento(Double monitoramento) {
        this.monitoramento = monitoramento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(nome).append(": ");
        sb.append("%.2f".formatted(monitoramento)).append(" ").append(unMedida);
        return sb.toString();
    }
}
