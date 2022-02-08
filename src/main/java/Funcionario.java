package main.java;

import java.time.LocalDate;

public class Funcionario extends Pessoa {

    protected String cargo;

    public Funcionario(){};

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeroCidadao(String numeroCidadao) {
        this.numeroCidadao = numeroCidadao;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setDataRegistoSistema(LocalDate dataRegistoSistema) {
        this.dataRegistoSistema = dataRegistoSistema;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
