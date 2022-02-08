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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCidadao() {
        return numeroCidadao;
    }

    public void setNumeroCidadao(String numeroCidadao) {
        this.numeroCidadao = numeroCidadao;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public LocalDate getDataRegistoSistema() {
        return dataRegistoSistema;
    }

    public void setDataRegistoSistema(LocalDate dataRegistoSistema) {
        this.dataRegistoSistema = dataRegistoSistema;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
