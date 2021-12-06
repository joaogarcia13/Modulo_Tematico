import java.util.Date;

public class CartaDeConducao{
    private String numero;
    private Date dataDeEmissao;
    private Date dataDeValidade;
    private String categoria;

    public CartaDeConducao(String numero, Date DataDeEmissao, Date DataDeValidade, String Categoria){
        this.numero=numero;
        this.dataDeEmissao=dataDeEmissao;
        this.dataDeValidade=dataDeValidade;
        this.categoria=categoria;
    }

    public String getNumero() {
        return numero;
    }

    public Date getDataDeEmissao() {
        return dataDeEmissao;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDataDeEmissao(Date dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}