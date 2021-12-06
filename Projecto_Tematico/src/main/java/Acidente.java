public class Acidente {
    private String data;
    private String descricao;
    private float valorPagar;
    private String culpado;
    private String dataLimitePagamento;

    public Acidente(String data,String descricao, float valorPagar, String culpado,
    String dataLimitePagamento){
        this.data=data;
        this.descricao=descricao;
        this.valorPagar=valorPagar;
        this.culpado=culpado;
        this.dataLimitePagamento=dataLimitePagamento;
    }

    public String getData() {
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

    public String getDataLimitePagamento() {
        return dataLimitePagamento;
    }

    public void setData(String data) {
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

    public void setDataLimitePagamento(String dataLimitePagamento) {
        this.dataLimitePagamento = dataLimitePagamento;
    }
}
