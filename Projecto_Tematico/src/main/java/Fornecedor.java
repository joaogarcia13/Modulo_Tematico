public class Fornecedor extends Pessoa{

    private int idProprietario;

    public Fornecedor(String nome, int id, int numeroCidadao, String morada, String dataRegistoSistema,
                      String dataNascimento, int numTelefone, String email, String username, String password, int idProprietario){

        this.nome=nome;
        this.id=id;
        this.numeroCidadao=numeroCidadao;
        this.morada=morada;
        this.dataRegistoSistema=dataRegistoSistema;
        this.dataNascimento=dataNascimento;
        this.numTelefone=numTelefone;
        this.email=email;
        this.username=username;
        this.password=password;
        this.idProprietario=idProprietario;
    }

    public void pedidoRegistoVeiculo(){};
    public void pedidoRemoverVeiculo(){};
    public void LevantarVeiculo(){};

    public int getIdProprietario() {
        return idProprietario;
    }

    public void setIdProprietario(int idProprietario) {
        this.idProprietario = idProprietario;
    }
}
