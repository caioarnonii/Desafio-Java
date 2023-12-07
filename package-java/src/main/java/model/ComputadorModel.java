package model;

public class ComputadorModel {

    private Integer idComputador;
    private Integer fkUsuario;
    private String ip;
    private String sistemaOperacional;
    private String fabricante;
    private String tempoAtividade;

    public ComputadorModel(
            Integer idComputador,
            Integer fkUsuario,
            String ip,
            String sistemaOperacional,
            String fabricante,
            String tempoAtividade
    ) {
        this.idComputador = idComputador;
        this.fkUsuario = fkUsuario;
        this.ip = ip;
        this.sistemaOperacional = sistemaOperacional;
        this.fabricante = fabricante;
        this.tempoAtividade = tempoAtividade;
    }


    public Integer getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public Integer getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Integer fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTempoAtividade() {
        return tempoAtividade;
    }

    public void setTempoAtividade(String tempoAtividade) {
        this.tempoAtividade = tempoAtividade;
    }
}
