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

    /**
     * Construtor da classe Carrinha
     * @param matricula
     * @param dataRegistoSistema
     * @param estado
     * @param marca
     * @param modelo
     * @param cilindrada
     * @param Potencia
     * @param combustivel
     * @param ano
     * @param numeroSeguro
     * @param dataValidadeSeguro
     * @param Inicio
     * @param Fim
     * @param km 
     */
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
    
    /**
     * método que retorna a data de registo no sistema
     * @return 
     */
    public LocalDate getDataRegistoSistem(){
        return DataRegistoSistema;
    }
    
    /**
     * método que retorna a data de validade do seguro
     * @return 
     */
    public LocalDate getdatValidadeSeguro(){
        return dataValidadeSeguro;
    }
    
    /**
     * método que retorna o inicio da disponibilidade
     * @return 
     */
    public LocalDate getInicioDisponibilidade(){
        return InicioDisponibilidade;
    }
    
    /**
     * método que retorna o fim da disponibilidade
     * @return 
     */
    public LocalDate getfimDisponibilidade(){
        return fimDisponibilidade;
    }
    
    /**
     * método que retorna os kilometros da carrinha quando foi registada no sistema
     * @return 
     */
    public String getKilm(){
        return kilm;
    }
    
    /**
     * método que retorna a marca da carrinha
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * método que retorna o modelo da carrinha
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * método que retorna a cilindrada da carrinha
     * @return 
     */
    public String getCilindrada() {
        return Cilindrada;
    }

    /**
     * método que retorna a potencia da carrinha
     * @return 
     */
    public String getPotencia() {
        return Potencia;
    }

    /**
     * método que retorna o tipo de combustivel da carrinha
     * @return 
     */
    public String getCombustivel() {
        return combustivel;
    }
    
    /**
     * método que retorna o ano da carrinha
     * @return 
     */
    public String getAno() {
        return ano;
    }
    
    /**
     * método que retorna a matricula da carrinha
     * @return 
     */
    public String getMatricula() {
        return matricula;
    }
    
    /**
     * método que retorna o estado da carrinha
     * @return 
     */
    public String getEstado() {
        return estado;
    }

    /**
     * método que retorna o numero do seguro da carrinha
     * @return 
     */
    public String getNumeroSeguro() {
        return numeroSeguro;
    }

    /**
     * Metodo que atribui um valor a variavel matricula
     * @param matricula 
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /**
     * Metodo que atribui um valor a variavel dataRegistoSistema
     * @param DataRegistoSistema 
     */
    public void setDataRegistoSistema(LocalDate DataRegistoSistema) {
        this.DataRegistoSistema = DataRegistoSistema;
    }
        
    /**
     * Metodo que atribui um valor a variavel ano
     * @param ano 
     */
    public void setAno(String ano) {
        this.ano = ano;
    }
    /**
     * Metodo que atribui um valor a variavel estado
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Metodo que atribui um valor a variavel marca
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Metodo que atribui um valor a variavel modelo
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo que atrbui um valor a variavel Cilindrada
     * @param Cilindrada 
     */
    public void setCilindrada(String Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    /**
     * Metodo que atrbui um valor a variavel potencia
     * @param Potencia 
     */
    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * Metodo que atrbui um valor a variavel CnumeroSeguro
     * @param numeroSeguro 
     */
    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    /**
     * Metodo que atrbui um valor a variavel dataValidadeSeguro
     * @param dataValidadeSeguro 
     */
    public void setDataValidadeSeguro(LocalDate dataValidadeSeguro) {
        this.dataValidadeSeguro = dataValidadeSeguro;
    }

    /**
     * Metodo que atrbui um valor a variavel InicioDataDisponibilidade
     * @param InicioDisponibilidade 
     */
    public void setInicioDisponibilidade(LocalDate InicioDisponibilidade) {
        this.InicioDisponibilidade = InicioDisponibilidade;
    }

    /**
     * Metodo que atrbui um valor a variavel fimDataDisponibilidade
     * @param fimDisponibilidade 
     */
    public void setFimDisponibilidade(LocalDate fimDisponibilidade) {
        this.fimDisponibilidade = fimDisponibilidade;
    }

    /**
     * Metodo que atrbui um valor a variavel kilm
     * @param kilm 
     */
    public void setKilm(String kilm) {
        this.kilm = kilm;
    }
}
