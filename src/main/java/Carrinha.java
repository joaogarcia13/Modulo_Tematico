package main.java;

import java.util.Date;

public class Carrinha {
    private String matricula;
    private Date dataRegisto;
    private Date dataRegistoSistema;
    private String estado;
    private String categoria;
    private boolean disponibilidade;
    private String numeroSeguro;
    private Date dataValidadeSeguro;
    private Date InicioDisponibilidade;
    private Date fimDisponibilidade;

    public Carrinha(String matricula, Date dataRegisto, Date dataRegistoSistema, String estado, String categoria, boolean disponibilidade, 
            String numeroSeguro, Date dataValidadeSeguro, Date Inicio, Date Fim){
        this.matricula=matricula;
        this.dataRegisto=dataRegisto;
        this.dataRegistoSistema=dataRegistoSistema;
        this.estado=estado;
        this.categoria=categoria;
        this.disponibilidade=disponibilidade;
        this.numeroSeguro=numeroSeguro;
        this.dataValidadeSeguro=dataValidadeSeguro;
        this.InicioDisponibilidade = Inicio;
        this.fimDisponibilidade = Fim;
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

    public Date getDataRegisto() {
        return dataRegisto;
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

    public void setDataRegisto(Date dataRegisto) {
        this.dataRegisto = dataRegisto;
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
