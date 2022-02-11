package main.java;

import java.time.LocalDate;

public class Condutor extends Pessoa{

    private String numeroCartaConducao;
    private int classificacao;

    /**
     * Construtor da classe Condutor
     * @param nome
     * @param id
     * @param numeroCidadao
     * @param morada
     * @param dataRegistoSistema
     * @param dataNascimento
     * @param numTelefone
     * @param email
     * @param numeroCartaoConducao 
     */
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
    
    /**
     * Metodo que retorna o numero de cidadao do condutor
     * @return 
     */
    public String getNumeroCartaConducao(){
        return numeroCartaConducao;
    }

    /**
     * Metodo que retona o nome do condutor
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que retorna o id de condutor
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que retorna o numero de cidadão do condutor
     * @return 
     */
    public String getNumeroCidadao() {
        return numeroCidadao;
    }

    /**
     * Metodo que retona a morada do condutor
     * @return 
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Metodo que retorna a data em que o condutor foi registado no sistema
     * @return 
     */
    public LocalDate getDataRegistoSistema() {
        return dataRegistoSistema;
    }

    /**
     * Metodo que retorna a data de nascimento do condutor
     * @return 
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    /**
     * Metodo que retorna o contacto telefonico do condutor
     * @return 
     */
    public int getNumTelefone() {
        return numTelefone;
    }

    /**
     * Metodo que retorna o email do condutor
     * @return 
     */
    public String getEmail() {
        return email;
    }  

    /**
     * Metodo que retorna a classificaçao do condutor
     * @return 
     */
    public int getClassificacao() {
        return classificacao;
    }

}
