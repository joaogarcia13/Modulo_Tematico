package main.java;

import java.util.Date;

public class Carrinha {
    private String matricula;
    private Date dataRegistoSistema;
    private String estado;
    private String categoria;
    private String marca;
    private String modelo;
    private String Cilindrada;
    private String Potencia;
    private float combustivel;
    private int ano;
    private boolean disponibilidade;
    private String numeroSeguro;
    private Date dataValidadeSeguro;
    private Date InicioDisponibilidade;
    private Date fimDisponibilidade;

    public Carrinha(String matricula, Date dataRegistoSistema, String estado, String categoria, String marca, String modelo, String cilindrada,
            String Potencia, float combustivel, int ano, boolean disponibilidade, String numeroSeguro, Date dataValidadeSeguro, Date Inicio, Date Fim){
        
        this.matricula=matricula;
        this.dataRegistoSistema=dataRegistoSistema;
        this.estado=estado;
        this.categoria=categoria;
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
        this.ano = ano;
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

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public void setAno(int ano) {
        this.ano = ano;
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

    public float getCombustivel() {
        return combustivel;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setInicioDisponibilidade(Date InicioDisponibilidade) {
        this.InicioDisponibilidade = InicioDisponibilidade;
    }

    public void setFimDisponibilidade(Date fimDisponibilidade) {
        this.fimDisponibilidade = fimDisponibilidade;
    }

    public Date getInicioDisponibilidade() {
        return InicioDisponibilidade;
    }

    public Date getFimDisponibilidade() {
        return fimDisponibilidade;
    }

    public String getMatricula() {
        return matricula;
    }
    public Date getDataRegistoSistema() {
        return dataRegistoSistema;
    }

    public String getEstado() {
        return estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    public Date getDataValidadeSeguro() {
        return dataValidadeSeguro;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setDataRegistoSistema(Date dataRegistoSistema) {
        this.dataRegistoSistema = dataRegistoSistema;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public void setDataValidadeSeguro(Date dataValidadeSeguro) {
        this.dataValidadeSeguro = dataValidadeSeguro;
    }
}
