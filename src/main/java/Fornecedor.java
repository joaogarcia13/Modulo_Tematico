package main.java;

import java.time.LocalDate;

public class Fornecedor extends Pessoa{

    /**
     * Construtor da classe Fornecedor
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
    public Fornecedor(String nome, int id, String numeroCidadao, String morada, LocalDate dataRegistoSistema,
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
}
