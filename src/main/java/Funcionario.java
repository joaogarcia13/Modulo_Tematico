package main.java;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

    protected String cargo;

    public Funcionario(){};
    
    /**
     * Construtor da classe funcionario
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
     * @param cargo 
     */
    public Funcionario(String nome, int id, String numeroCidadao, String morada, LocalDate dataRegistoSistema,
                       LocalDate dataNascimento, int numTelefone, String email, String username, String password,
                       String cargo) {

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
        this.cargo=cargo;
    }

    /**
     * Metodo que retorna o cargo do funcionario
     * @return 
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Metodo que retorna o nome do funcionario
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo que retorna o id do funcionario
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que retorna o numero de cidadao do funcionario
     * @return 
     */
    public String getNumeroCidadao() {
        return numeroCidadao;
    }
    
    /**
     * Metodo que retorna a morada do funcionario
     * @return 
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Metodo que retorna a data de registo no sistema do funcionario
     * @return 
     */
    public LocalDate getDataRegistoSistema() {
        return dataRegistoSistema;
    }
    
    /**
     * Metodo que retorna a data de nascimento do funcionario
     * @return 
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Metodo que retorna o numero de telefone do funcionario
     * @return 
     */
    public int getNumTelefone() {
        return numTelefone;
    }
    
    /**
     * Metodo que retorna o email do funcionario
     * @return 
     */
    public String getEmail() {
        return email;
    }
    /**
     * Metodo que retorna o username do funcionario
     * @return 
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Metodo que retorna a password do funcionario
     * @return 
     */
    public String getPassword() {
        return password;
    }

}
