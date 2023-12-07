package model;

public abstract class ComponenteModel {

    private String nome;

    public ComponenteModel(String nome) {
        this.nome = nome;
    }

    public abstract double getUsoPercentual();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
