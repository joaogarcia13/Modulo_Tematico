public class Funcionario extends Pessoa {

    protected String cargo;
    protected int idFuncionario;

    public Funcionario(){};

    public Funcionario(String nome, int id, int numeroCidadao, String morada, String dataRegistoSistema,
                       String dataNascimento, int numTelefone, String email, String username, String password,
                       String cargo, int idFuncionario) {

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
        this.idFuncionario=idFuncionario;
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

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
