import java.util.Date;

public class Acidente {
    private int id;
    private Date data;
    private String descricao;
    private float valorPagar;
    private String culpado;
    private Date dataLimitePagamento;

    public Acidente(int id, Date data, String descricao, float valorPagar, String culpado,
                    Date dataLimitePagamento){
        this.id=id;
        this.data=data;
        this.descricao=descricao;
        this.valorPagar=valorPagar;
        this.culpado=culpado;
        this.dataLimitePagamento=dataLimitePagamento;
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

    public String getCulpado() {
        return culpado;
    }

    public Date getDataLimitePagamento() {
        return dataLimitePagamento;
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

    public void setCulpado(String culpado) {
        this.culpado = culpado;
    }

    public void setDataLimitePagamento(Date dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }
}
