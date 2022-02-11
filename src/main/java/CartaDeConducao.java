package main.java;

import java.time.LocalDate;

public class CartaDeConducao{
    private String numero;
    private LocalDate dataDeEmissao;
    private LocalDate dataDeValidade;
    private String categoria;

    /**
     * construtor da classe cartaDeConducao
     * @param numero
     * @param DataDeEmissao
     * @param DataDeValidade
     * @param Categoria 
     */
    public CartaDeConducao(String numero, LocalDate DataDeEmissao, LocalDate DataDeValidade, String Categoria){
        this.numero = numero;
        this.dataDeEmissao = DataDeEmissao;
        this.dataDeValidade = DataDeValidade;
        this.categoria = Categoria;
    }

    /**
     * método que retorna o numero da carta de conduçao
     * @return 
     */
    public String getNumero() {
        return numero;
    }

    /**
     * método que retorna a data de emissao da carta de conduçao 
     * @return 
     */
    public LocalDate getDataDeEmissao() {
        return dataDeEmissao;
    }

    /**
     * método que retorna a data de validade da carta de condução
     * @return 
     */
    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }
    
    /**
     * método que retorna a categoria da carta de conduçao
     * @return 
     */
    public String getCategoria() {
        return categoria;
    }
}