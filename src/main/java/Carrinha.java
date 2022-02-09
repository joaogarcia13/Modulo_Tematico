package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Carrinha {
    private String matricula;
    private LocalDate DataRegistoSistema;
    private String ano;
    private String estado;
    private String marca;
    private String modelo;
    private String Cilindrada;
    private String Potencia;
    private String combustivel;
    private String numeroSeguro;
    private LocalDate dataValidadeSeguro;
    private LocalDate InicioDisponibilidade;
    private LocalDate fimDisponibilidade;
    private String kilm;

    public Carrinha(String matricula, LocalDate dataRegistoSistema, String estado, String marca, String modelo, String cilindrada,
            String Potencia, String combustivel, String ano, String numeroSeguro, LocalDate dataValidadeSeguro, LocalDate Inicio, LocalDate Fim, String km){
        
        this.matricula=matricula;
        this.ano=ano;
        this.estado=estado;
        this.numeroSeguro=numeroSeguro;
        this.dataValidadeSeguro=dataValidadeSeguro;
        this.InicioDisponibilidade = Inicio;
        this.fimDisponibilidade = Fim;
        this.marca = marca;
        this.modelo=modelo;
        this.Cilindrada=cilindrada;
        this.Potencia = Potencia;
        this.combustivel = combustivel;
        this.DataRegistoSistema = dataRegistoSistema;
        this.kilm = km;
    }
    
    public LocalDate getDataRegistoSistem(){
        return DataRegistoSistema;
    }

    public void setDataRegistoSistema(LocalDate DataRegistoSistema) {
        this.DataRegistoSistema = DataRegistoSistema;
    }
    
    public LocalDate getdatValidadeSeguro(){
        return dataValidadeSeguro;
    }
    
    public LocalDate getInicioDisponibilidade(){
        return InicioDisponibilidade;
    }
    
    public LocalDate getfimDisponibilidade(){
        return fimDisponibilidade;
    }
    
    public String getKilm(){
        return kilm;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return Cilindrada;
    }

    public String getPotencia() {
        return Potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getAno() {
        return ano;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getEstado() {
        return estado;
    }

    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setDataValidadeSeguro(LocalDate dataValidadeSeguro) {
        this.dataValidadeSeguro = dataValidadeSeguro;
    }

    public void setInicioDisponibilidade(LocalDate InicioDisponibilidade) {
        this.InicioDisponibilidade = InicioDisponibilidade;
    }

    public void setFimDisponibilidade(LocalDate fimDisponibilidade) {
        this.fimDisponibilidade = fimDisponibilidade;
    }

    public void setKilm(String kilm) {
        this.kilm = kilm;
    }
    
    
    
}
