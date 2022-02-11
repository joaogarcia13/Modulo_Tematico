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

    /**
     * construtor da classe acidente
     * @param id
     * @param data
     * @param descricao
     * @param valorPagar
     * @param dataLimitePagamento 
     */
    public Acidente(int id, LocalDate data, String descricao, float valorPagar,
                    LocalDate dataLimitePagamento){
        this.id=id;
        this.data=data;
        this.descricao=descricao;
        this.valorPagar=valorPagar;
        this.dataLimitePagamento=dataLimitePagamento;
    }
    /**
     * método que retorna o id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * método que retorna a descriçao
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * método que retorna o valor a pagar
     * @return 
     */
    public float getValorPagar() {
        return valorPagar;
    }

    /**
     * método que retorna a data
     * @return 
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * método que retorna a data limite de pagamento
     * @return 
     */
    public LocalDate getDataLimitePagamento() {
        return dataLimitePagamento;
    }
}
