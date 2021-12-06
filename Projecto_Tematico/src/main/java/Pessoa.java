public class Pessoa {
    private String nome;
    private int id;
    private int numeroCidadao;
    private String morada;
    private String dataRegistoSistema;
    private String dataNascimento;
    private int numTelefone;
    private String email;
    private String username;
    private String password;

    public Pessoa(String nome, int id, int numeroCidadao, String morada, String dataRegistoSistema,
    String dataNascimento, int numTelefone, String email, String username, String password){

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
        
    }
}
