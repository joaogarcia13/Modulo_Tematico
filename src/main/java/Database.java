package main.java;

import java.sql.*;
import static java.sql.DriverManager.*;

public class Database{
    private Connection cnn;
    private Statement stm;
    
    public void openConnection() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://192.168.160.156:3306/PTDA_BD_1?user=PTDA_1&password=uhtin_45");
            stm = cnn.createStatement();
    }
    public ResultSet select(String cmd) throws SQLException {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ResultSet rs = stm.executeQuery(cmd);
        return rs;
    }
    public void eliminar(String tabela, String campoIdentificador, String valor) throws SQLException{
        String cmd;
        cmd = "delete from " + tabela + " where " + campoIdentificador + " = '" + valor + "'";
        stm.executeUpdate(cmd);
    }
    public void update(String tabela, String campoAMudar, String valorNovo, String campoIdentificador, String valor) throws SQLException{
        String cmd;
        cmd = "update " + tabela + " set " + campoAMudar + " = '" + valorNovo + "' where " + campoIdentificador + " = '" + valor + "'";
        stm.executeUpdate(cmd);
    }
    public void insertCarrinha(Carrinha c, String proprietario) throws SQLException{
        String cmd; 
        cmd = "insert into carrinhas(matricula, dataRegistoSistema, estado, disponibilidade, numeroSeguro, dataValidadeSeguro, "
                + "proprietario, marca, modelo, cilindrada, potencia, combustivel, dataInicioDisponibilidade, dataFimDisponibilidade,"
                + "nrKm, precoDia, precoKmExtra, ano)values(";
        cmd = cmd + "'" + c.getMatricula() + "', ";
        cmd = cmd + "'" + c.getDataRegistoSistem() + "', ";
        cmd = cmd + "'" + c.getEstado() + "', ";
        cmd = cmd + "'" + c.getDisponibilidade() + "', ";
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
    public void insertPessoa(Pessoa p) throws SQLException{
        String cmd;
        cmd = "insert into pessoas(nome, numeroCC, morada, dataRegistoSistema, dataNascimento, numTelef, email, username, password)values(";
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
    public void insertAcidente(Acidente a, String carrinha) throws SQLException{
        String cmd;
        cmd = "insert into acidentes(data, descricao, valorPagar, dataLimitePagamento, carrinha)values(";
        cmd = cmd + "'" + a.getData() + "', ";
        cmd = cmd + "'" + a.getDescricao() + "', ";
        cmd = cmd + "'" + a.getValorPagar() + "', ";
        cmd = cmd + "'" + a.getDataLimitePagamento() + "', ";
        cmd = cmd + "'" + carrinha + "') ";
        stm.executeUpdate(cmd);
    }
    public void executeInsert(String cmd) throws SQLException{
        stm.executeUpdate(cmd);
    }
}