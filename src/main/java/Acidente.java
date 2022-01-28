package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Acidente {
    private int id;
    private String matricula;
    private LocalDate data;
    private String descricao;
    private float valorPagar;
    private LocalDate dataLimitePagamento;

    public Acidente(String matricula, int id, LocalDate data, String descricao, float valorPagar,
                    LocalDate dataLimitePagamento){
        this.id=id;
        this.data=data;
        this.descricao=descricao;
        this.valorPagar=valorPagar;
        this.dataLimitePagamento=dataLimitePagamento;
        this.matricula=matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

}
