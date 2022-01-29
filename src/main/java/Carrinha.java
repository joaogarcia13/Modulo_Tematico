package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Carrinha {
    private String matricula;
    private String DataRegistoMatricula;
    private LocalDateTime dataRegistoSistema;
    private String estado;
    private String marca;
    private String modelo;
    private String Cilindrada;
    private String Potencia;
    private String combustivel;
    private Boolean disponibilidade;
    private String numeroSeguro;
    private LocalDate dataValidadeSeguro;
    private LocalDateTime InicioDisponibilidade;
    private LocalDateTime fimDisponibilidade;

    public Carrinha(String matricula, LocalDateTime dataRegistoSistema, String estado, String marca, String modelo, String cilindrada,
            String Potencia, String combustivel, String ano, boolean disponibilidade, String numeroSeguro, LocalDate dataValidadeSeguro, LocalDateTime Inicio, LocalDateTime Fim){
        
        this.matricula=matricula;
        this.dataRegistoSistema=dataRegistoSistema;
        this.estado=estado;
        this.disponibilidade=disponibilidade;
        this.numeroSeguro=numeroSeguro;
        this.dataValidadeSeguro=dataValidadeSeguro;
        this.InicioDisponibilidade = Inicio;
        this.fimDisponibilidade = Fim;
        this.marca = marca;
        this.modelo=modelo;
        this.Cilindrada=cilindrada;
        this.Potencia = Potencia;
        this.combustivel = combustivel;
        this.DataRegistoMatricula = ano;
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

    public void setAno(String ano) {
        this.DataRegistoMatricula = ano;
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
        return DataRegistoMatricula;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getEstado() {
        return estado;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
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

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
    
    
    
}
