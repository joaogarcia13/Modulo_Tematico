package main.java;

import java.util.Date;

public class Fornecedor extends Pessoa{


    public Fornecedor(String nome, int id, String numeroCidadao, String morada, Date dataRegistoSistema,
                      Date dataNascimento, int numTelefone, String email, String username, String password){

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

    public void pedidoRegistoVeiculo(){};
    public void pedidoRemoverVeiculo(){};
    public void LevantarVeiculo(){};

}