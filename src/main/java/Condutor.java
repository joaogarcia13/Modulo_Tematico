package main.java;

import java.time.LocalDate;

public class Condutor extends Pessoa{

    private String numeroCartaConducao;
    private int classificacao;

    public Condutor (String nome, int id, String numeroCidadao, String morada, LocalDate dataRegistoSistema,
    LocalDate dataNascimento, int numTelefone, String email, String numeroCartaoConducao){

        this.nome=nome;
        this.id=id;
        this.numeroCidadao=numeroCidadao;
        this.morada=morada;
        this.dataRegistoSistema=dataRegistoSistema;
        this.dataNascimento=dataNascimento;
        this.numTelefone=numTelefone;
        this.email=email;
        this.numeroCartaConducao=numeroCartaoConducao;
    }
    
    public String getNumeroCartaConducao(){
        return numeroCartaConducao;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getNumeroCidadao() {
        return numeroCidadao;
    }

    public String getMorada() {
        return morada;
    }

    public LocalDate getDataRegistoSistema() {
        return dataRegistoSistema;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public String getEmail() {
        return email;
    }  

    public void setNumeroCartaConducao(String numeroCartaConducao) {
        this.numeroCartaConducao = numeroCartaConducao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
