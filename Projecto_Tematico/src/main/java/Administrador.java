public class Administrador extends Funcionario{

    public Administrador(String nome, int id, int numeroCidadao, String morada, String dataRegistoSistema,
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

    public void editarFuncionario(){};
    public void removerFuncionario(){};
    public void adicionarFuncionario(){};
}
