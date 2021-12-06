public class Condutor extends Pessoa{

    private int idCondutor;
    private int numeroCartaConducao;
    private int classificacao;

    public Condutor (String nome, int id, int numeroCidadao, String morada, String dataRegistoSistema,
    String dataNascimento, int numTelefone, String email, String username, String password, int idCondutor, int numeroCartaoConducao,int classificacao){

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
        this.idCondutor=idCondutor;
        this.numeroCartaConducao=numeroCartaoConducao;
        this.classificacao=classificacao;
    }

    public void alugarVeiculo(){};
    public void reportarAcidente(){};
    public void efetuarPagamentoEmpresa(){};

    public int getIdCondutor() {
        return idCondutor;
    }

    public void setIdCondutor(int idCondutor) {
        this.idCondutor = idCondutor;
    }

    public int getNumeroCartaConducao() {
        return numeroCartaConducao;
    }

    public void setNumeroCartaConducao(int numeroCartaConducao) {
        this.numeroCartaConducao = numeroCartaConducao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
}
