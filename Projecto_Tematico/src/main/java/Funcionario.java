import java.util.Date;

public class Funcionario extends Pessoa {

    protected String cargo;

    public Funcionario(){};

    public Funcionario(String nome, int id, String numeroCidadao, String morada, Date dataRegistoSistema,
                       Date dataNascimento, int numTelefone, String email, String username, String password,
                       String cargo) {

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
        this.cargo=cargo;
    }

    public void registarVeiculo(){};
    public void removerVeiculo(){};
    public void efetuarPagamentoFornecedor(){};

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
