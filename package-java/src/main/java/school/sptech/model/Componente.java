package school.sptech.model;

public abstract class Componente {

    private String nome;

    public Componente(String nome) {
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
