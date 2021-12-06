import java.util.Date;

public class Carrinha {
    private String matricula;
    private Date dataRegisto;
    private Date dataRegistoSistema;
    private String estado;
    private String categoria;
    private boolean disponibilidade;
    private int numeroSeguro;
    private String dataValidadeSeguro;

    public Carrinha(String matricula, Date dataRegisto, Date dataRegistoSistema,
                    String estado, String categoria, boolean disponibilidade, int numeroSeguro, String dataValidadeSeguro){
        this.matricula=matricula;
        this.dataRegisto=dataRegisto;
        this.dataRegistoSistema=dataRegistoSistema;
        this.estado=estado;
        this.categoria=categoria;
        this.disponibilidade=disponibilidade;
        this.numeroSeguro=numeroSeguro;
        this.dataValidadeSeguro=dataValidadeSeguro;
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

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public int getNumeroSeguro() {
        return numeroSeguro;
    }

    public String getDataValidadeSeguro() {
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

    public void setNumeroSeguro(int numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }

    public void setDataValidadeSeguro(String dataValidadeSeguro) {
        this.dataValidadeSeguro = dataValidadeSeguro;
    }
}
