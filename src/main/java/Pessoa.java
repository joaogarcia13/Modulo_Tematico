package main.java;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected int id;
    protected String numeroCidadao;
    protected String morada;
    protected LocalDate dataRegistoSistema;
    protected LocalDate dataNascimento;
    protected int numTelefone;
    protected String email;
    protected String username;
    protected String password;

    public Pessoa(){};

    /**
     * Construtor da classe Pessoa
     * @param nome
     * @param id
     * @param numeroCidadao
     * @param morada
     * @param dataRegistoSistema
     * @param dataNascimento
     * @param numTelefone
     * @param email
     * @param username
     * @param password 
     */
    public Pessoa(String nome, int id, String numeroCidadao, String morada, LocalDate dataRegistoSistema,
    LocalDate dataNascimento, int numTelefone, String email, String username, String password){

        this.nome=nome;
        this.id=id;
        this.numeroCidadao=numeroCidadao;
        this.morada=morada;
        this.dataRegistoSistema=dataRegistoSistema;
        this.dataNascimento=dataNascimento;
        this.numTelefone=numTelefone;
        this.email=email;
        this.username=username;
        this.password=password;

    }

    /**
     * Metodo que retorna o nome do objecto pessoa
     * @return 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Metodo que retorna o id do Objecto pessoa
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que retorna o numero de cidadao do objecto pessoa
     * @return 
     */
    public String getNumeroCidadao() {
        return numeroCidadao;
    }
    
    /**
     * Metodo que retorna a morada do objecto pessoa
     * @return 
     */
    public String getMorada() {
        return morada;
    }
    
    /**
     * Metodo que retorna a data de Registo do objecto pessoa no sistema
     * @return 
     */
    public LocalDate getDataRegistoSistema() {
        return dataRegistoSistema;
    }

    /**
     * Metodo que retorna a data de nascimento do objecto pessoa
     * @return 
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Metodo que retorna o numero de telefone do objecto pessoa
     * @return 
     */
    public int getNumTelefone() {
        return numTelefone;
    }

    /**
     * Metodo que retorna o email do objecto pessoa
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo que retorna o username do objecto pessoa
     * @return 
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo que retorna a password do objecto pessoa
     * @return 
     */
    public String getPassword() {
        return password;
    }
    
}
