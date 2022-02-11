package main.java;

import java.sql.*;
import static java.sql.DriverManager.*;

public class Database{
    private Connection cnn;
    private Statement stm;
    
    /**
     * Metodo que estabelece conecao com a base de dados
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public void openConnection() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://192.168.160.156:3306/PTDA_BD_1?user=PTDA_1&password=uhtin_45");
            stm = cnn.createStatement();
    }
    /**
     * Metodo que executa o comando SQL passado como string e guarda os resultados num ResultSet
     * @param cmd
     * @return ResultSet
     * @throws SQLException 
     */
    public ResultSet select(String cmd) throws SQLException {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ResultSet rs = stm.executeQuery(cmd);
        return rs;
    }
    
    /**
     * Metodo que elemina uma linha de uma tabela na base de dados indetificada pelos parametros de entrada
     * @param tabela
     * @param campoIdentificador
     * @param valor
     * @throws SQLException 
     */
    public void eliminar(String tabela, String campoIdentificador, String valor) throws SQLException{
        String cmd;
        cmd = "delete from " + tabela + " where " + campoIdentificador + " = '" + valor + "'";
        stm.executeUpdate(cmd);
    }
    
    /**
     * Metodo que faz um update numa linha de uma tabela na base de dados, indetificada pelos parametros de entrada
     * @param tabela
     * @param campoAMudar
     * @param valorNovo
     * @param campoIdentificador
     * @param valor
     * @throws SQLException 
     */
    public void update(String tabela, String campoAMudar, String valorNovo, String campoIdentificador, String valor) throws SQLException{
        String cmd;
        cmd = "update " + tabela + " set " + campoAMudar + " = '" + valorNovo + "' where " + campoIdentificador + " = '" + valor + "'";
        stm.executeUpdate(cmd);
    }
    
    /**
     * Metodo que recebe um objecto carrinha e nome do proprietario e insere a infromaçao na base de dados na tabela carrinhas
     * @param c
     * @param proprietario
     * @throws SQLException 
     */
    public void insertCarrinha(Carrinha c, String proprietario) throws SQLException{
        String cmd; 
        cmd = "insert into carrinhas(matricula, dataRegistoSistema, estado, numeroSeguro, dataValidadeSeguro, "
                + "proprietario, marca, modelo, cilindrada, potencia, combustivel, dataInicioDisponibilidade, dataFimDisponibilidade,"
                + "nrKm, precoDia, precoKmExtra, ano)values(";
        cmd = cmd + "'" + c.getMatricula() + "', ";
        cmd = cmd + "'" + c.getDataRegistoSistem() + "', ";
        cmd = cmd + "'" + c.getEstado() + "', ";
        cmd = cmd + "'" + c.getNumeroSeguro() + "', ";
        cmd = cmd + "'" + c.getdatValidadeSeguro() + "', ";
        cmd = cmd + "'" + proprietario + "', ";
        cmd = cmd + "'" + c.getMarca() + "', ";
        cmd = cmd + "'" + c.getModelo() + "', ";
        cmd = cmd + "'" + c.getCilindrada() + "', ";
        cmd = cmd + "'" + c.getPotencia() + "', ";
        cmd = cmd + "'" + c.getCombustivel() + "', ";
        cmd = cmd + "'" + c.getInicioDisponibilidade() + "', ";
        cmd = cmd + "'" + c.getfimDisponibilidade() + "', ";
        cmd = cmd + "'" + c.getKilm() + "', ";
        cmd = cmd + "'" + 30.0 + "', "; //a mudar o preco
        cmd = cmd + "'" + 0.20 + "', "; //mudar o preço
        cmd = cmd + "'" + c.getAno() + "')";
        System.out.println(cmd);
        stm.executeUpdate(cmd);
        
    }
    
    /**
     * Metodo que recebe como parametro um objecto do tipo pessoa e insere-o na tabela pessoas da base de dados
     * @param p
     * @throws SQLException 
     */
    public void insertPessoa(Pessoa p) throws SQLException{
        String cmd;
        cmd = "insert into pessoas(nome, numeroCC, morada, dataRegistoSistema, dataNascimento, numTelefone, email, username, password)values(";
        cmd = cmd + "'" + p.getNome() + "', ";
        cmd = cmd + "'" + p.getNumeroCidadao()+ "', ";
        cmd = cmd + "'" + p.getMorada() + "', ";
        cmd = cmd + "'" + p.getDataRegistoSistema().toString() + "', ";
        cmd = cmd + "'" + p.getDataNascimento().toString() + "', ";
        cmd = cmd + "'" + p.getNumTelefone()+ "', ";
        cmd = cmd + "'" + p.getEmail() + "', ";
        cmd = cmd + "'" + p.getUsername() + "', ";
        cmd = cmd + "'" + p.getPassword()+ "') ";
        stm.executeUpdate(cmd);
    }
    
    /**
     * Metodo que recebe como parametro um objecto do tipo acidente, a matricula e o culpado e insere na tabela de acidentes da base de dados
     * @param a
     * @param carrinha
     * @param culpado
     * @throws SQLException 
     */
    public void insertAcidente(Acidente a, String carrinha, String culpado) throws SQLException{
        String cmd;
        cmd = "insert into acidentes(data, descricao, valorPagar, dataLimitePagamento, carrinha, cartaConducaoCulpado)values(";
        cmd = cmd + "'" + a.getData() + "', ";
        cmd = cmd + "'" + a.getDescricao() + "', ";
        cmd = cmd + "'" + a.getValorPagar() + "', ";
        cmd = cmd + "'" + a.getDataLimitePagamento() + "', ";
        cmd = cmd + "'" + carrinha + "', ";
        cmd = cmd + "'" + culpado + "') ";
        stm.executeUpdate(cmd);
    }
    
    /**
     * Metodo que insere o objecto do tipo funcionario passado como parametro na tabela funcionarios da base de dados
     * @param f
     * @throws SQLException 
     */
    public void insertFuncionario(Funcionario f) throws SQLException{
        String cmd;
        cmd = "insert into pessoas(nome, numeroCC, morada, dataRegistoSistema, dataNascimento, numTelefone, email, username, password)values(";
        cmd = cmd + "'" + f.getNome() + "', ";
        cmd = cmd + "'" + f.getNumeroCidadao()+ "', ";
        cmd = cmd + "'" + f.getMorada() + "', ";
        cmd = cmd + "'" + f.getDataRegistoSistema().toString() + "', ";
        cmd = cmd + "'" + f.getDataNascimento().toString() + "', ";
        cmd = cmd + "'" + f.getNumTelefone()+ "', ";
        cmd = cmd + "'" + f.getEmail() + "', ";
        cmd = cmd + "'" + f.getUsername() + "', ";
        cmd = cmd + "'" + f.getPassword()+ "') ";
        stm.executeUpdate(cmd);
        ResultSet rs = null;
        rs = select("select id from pessoas where numeroCC='" + f.getNumeroCidadao() +"'");
        rs.next();
        cmd = "insert into funcionarios (idPessoa, cargo)values(";
        cmd = cmd + "'" + rs.getString("id") + "',";
        cmd = cmd + "'" + f.getCargo() + "') ";
        stm.executeUpdate(cmd);
        
    }
    
    /**
     * Metodo que insere o objecto condutor e o objecto cartadeConduçao nas tabelas condutores e cartasdeconducao da base de dados
     * @param f
     * @param c
     * @throws SQLException 
     */
    public void insertCondutor(Condutor f, CartaDeConducao c) throws SQLException{
        String cmd;
        cmd = "insert into pessoas(nome, numeroCC, morada, dataRegistoSistema, dataNascimento, numTelefone, email)values(";
        cmd = cmd + "'" + f.getNome() + "', ";
        cmd = cmd + "'" + f.getNumeroCidadao()+ "', ";
        cmd = cmd + "'" + f.getMorada() + "', ";
        cmd = cmd + "'" + f.getDataRegistoSistema().toString() + "', ";
        cmd = cmd + "'" + f.getDataNascimento().toString() + "', ";
        cmd = cmd + "'" + f.getNumTelefone()+ "', ";
        cmd = cmd + "'" + f.getEmail() + "') ";
        stm.executeUpdate(cmd);
        ResultSet rs = null;
        rs = select("select id from pessoas where numeroCC='" + f.getNumeroCidadao() +"'");
        rs.next();
        cmd = "insert into cartasconducao (idPessoa, numeroCartaConducao, dataEmissao, dataValidade, categoria)values(";
        System.out.println(c.getDataDeEmissao());
        cmd = cmd + "'" + rs.getString("id") + "', ";
        cmd = cmd + "'" + c.getNumero() + "', ";
        cmd = cmd + "'" + c.getDataDeEmissao().toString() + "', ";
        cmd = cmd + "'" + c.getDataDeValidade().toString() + "', ";
        cmd = cmd + "'" + c.getCategoria() + "')";
        stm.executeUpdate(cmd);
        rs = select("select id from pessoas where numeroCC='" + f.getNumeroCidadao() +"'");
        rs.next();
        cmd = "insert into condutores (numeroCartaConducao, classificacao, idPessoa)values(";
        cmd = cmd + "'" + f.getNumeroCartaConducao() + "',";
        cmd = cmd + "'" + 0 +"',";
        cmd = cmd + "'" + rs.getString("id") + "') ";
        stm.executeUpdate(cmd);
        
    }
    
    /**
     * Metodo que recebe um comnado de sql como parametro e o executa na base de dados
     * @param cmd
     * @throws SQLException 
     */
    public void executeInsert(String cmd) throws SQLException{
        stm.executeUpdate(cmd);
    }
}