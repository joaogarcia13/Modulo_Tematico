package main.java;

import java.time.LocalDateTime;
import java.util.Date;

public class Acidente {
    private int id;
    private String matricula;
    private Date data;
    private String descricao;
    private float valorPagar;
    private Date dataLimitePagamento;

    public Acidente(String matricula, int id, Date data, String descricao, float valorPagar,
                    Date dataLimitePagamento){
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

    public Date getData() {
        return data;
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

    public void setData(Date data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    public void setDataLimitePagamento(Date dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }

    public Date getDataLimitePagamento() {
        return dataLimitePagamento;
    }

}
