public class Pessoa {
    protected String nome;
    protected int id;
    protected int numeroCidadao;
    protected String morada;
    protected String dataRegistoSistema;
    protected String dataNascimento;
    protected int numTelefone;
    protected String email;
    protected String username;
    protected String password;

    public Pessoa(){};

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCidadao() {
        return numeroCidadao;
    }

    public void setNumeroCidadao(int numeroCidadao) {
        this.numeroCidadao = numeroCidadao;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getDataRegistoSistema() {
        return dataRegistoSistema;
    }

    public void setDataRegistoSistema(String dataRegistoSistema) {
        this.dataRegistoSistema = dataRegistoSistema;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
