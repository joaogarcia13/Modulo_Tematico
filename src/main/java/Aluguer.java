package main.java;

public class Aluguer {
    private String horario;
    private String regularidade;
    private float preco;
    private String estado;
    private int classificacao;

    public Aluguer(String horario, String regularidade, float preco, String estado, int classificacao) {
        this.horario = horario;
        this.regularidade = regularidade;
        this.preco = preco;
        this.estado = estado;
        this.classificacao = classificacao;
    }

    public String getHorario() {
        return horario;
    }

    public String getRegularidade() {
        return regularidade;
    }

    public float getPreco() {
        return preco;
    }

    public String getEstado() {
        return estado;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setRegularidade(String regularidade) {
        this.regularidade = regularidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}