package main.java;

import java.time.LocalDate;

public class CartaDeConducao{
    private String numero;
    private LocalDate dataDeEmissao;
    private LocalDate dataDeValidade;
    private String categoria;

    public CartaDeConducao(String numero, LocalDate DataDeEmissao, LocalDate DataDeValidade, String Categoria){
        this.numero=numero;
        this.dataDeEmissao=dataDeEmissao;
        this.dataDeValidade=dataDeValidade;
        this.categoria=categoria;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getDataDeEmissao() {
        return dataDeEmissao;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDataDeEmissao(LocalDate dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}