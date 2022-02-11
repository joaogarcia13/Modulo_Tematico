package main.java;

public class Aluguer {
    private String horario;
    private String regularidade;
    private float preco;
    private String estado;
    private int classificacao;
    
    /**
     * Construtor da classe Aluguer 
     * @param horario
     * @param regularidade
     * @param preco
     * @param estado
     * @param classificacao 
     */
    public Aluguer(String horario, String regularidade, float preco, String estado, int classificacao) {
        this.horario = horario;
        this.regularidade = regularidade;
        this.preco = preco;
        this.estado = estado;
        this.classificacao = classificacao;
    }

    /**
     * metodo que retorna o horario do aluguer
     * @return 
     */
    public String getHorario() {
        return horario;
    }

    /**
     * método que retorna a regularidade do aluguer
     * @return 
     */
    public String getRegularidade() {
        return regularidade;
    }
    
    /**
     * método que retorna o preço do aluguer 
     * @return 
     */
    public float getPreco() {
        return preco;
    }

    /**
     * método que retorna o estado do aluguer
     * @return 
     */
    public String getEstado() {
        return estado;
    }

    /**
     * método que retorna a classificação
     * @return 
     */
    public int getClassificacao() {
        return classificacao;
    }
}