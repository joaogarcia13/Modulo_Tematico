package main.java;

import java.time.LocalDate;

public class Administrador extends Funcionario{

    public Administrador(String nome, int id, String numeroCidadao, String morada, LocalDate dataRegistoSistema,
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

    public void editarFuncionario(){};
    public void removerFuncionario(){};
    public void adicionarFuncionario(){};
}
