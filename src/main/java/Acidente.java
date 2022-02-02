package main.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Acidente {
    private int id;
    private LocalDate data;
    private String descricao;
    private float valorPagar;
    private LocalDate dataLimitePagamento;

    public Acidente(int id, LocalDate data, String descricao, float valorPagar,
                    LocalDate dataLimitePagamento){
        this.id=id;
        this.data=data;
        this.descricao=descricao;
        this.valorPagar=valorPagar;
        this.dataLimitePagamento=dataLimitePagamento;
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

    public LocalDate getData() {
        return data;
    }

    public LocalDate getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setDataLimitePagamento(LocalDate dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }
    

}
