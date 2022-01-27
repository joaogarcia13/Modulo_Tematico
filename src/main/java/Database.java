package main.java;

import java.sql.*;
import static java.sql.DriverManager.*;
import javax.swing.JOptionPane;

public class Database{
    private Connection cnn;
    private Statement stm;
    
    public void openConnection() throws SQLException {
            cnn = getConnection("estga-dev.clients.ua.pt3306",
                    "PTDA_BD_1",
                    "uhtin_45");
            stm = cnn.createStatement();
    }
    public ResultSet select(String cmd) throws SQLException {
        ResultSet rs = stm.executeQuery(cmd);
        try{
            stm.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(new JOptionPane(), e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public void eliminar(String tabela, String campoIdentificador, String valor) throws SQLException{
        String cmd;
        cmd = "delete * from " + tabela + "where " + campoIdentificador + " = '" + valor + "'";
        stm.executeQuery(cmd);
    }
    public void update(String tabela, String campoAMudar, String valorNovo, String campoIdentificador, String valor) throws SQLException{
        String cmd;
        cmd = "update " + tabela + "set " + campoAMudar + " = '" + valorNovo + "' where " + campoIdentificador + " = '" + valor + "'";
        stm.executeQuery(cmd);
    }
    public void insertCarrinha(Carrinha c, String proprietario) throws SQLException{
        String cmd; 
        cmd = "insert into carrinhas(matricula, dataRegisto, dataRegistoSistema, estado, categoria, disponibilidade, numeroSeguro, dataValidadeSeguro, proprietario)values(";
        cmd = cmd + "'" + c.getMatricula() + "', ";
        cmd = cmd + "'" + c.getDataRegistoSistema().toString() + "', ";
        cmd = cmd + "'" + c.getEstado() + "', ";
        cmd = cmd + "'" + c.getDisponibilidade() + "', ";
        cmd = cmd + "'" + c.getNumeroSeguro() + "', ";
        cmd = cmd + "'" + c.getDataValidadeSeguro() + "', ";
        cmd = cmd + "'" + proprietario + "') ";
        stm.executeQuery(cmd);
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
        stm.executeQuery(cmd);
    }
    public void insertAcidente(Acidente a, String carrinha) throws SQLException{
        String cmd;
        cmd = "insert into acidentes(data, descricao, valorPagar, culpado, dataLimitePagamento, carrinha)values(";
        cmd = cmd + "'" + a.getData().toString() + "', ";
        cmd = cmd + "'" + a.getDescricao() + "', ";
        cmd = cmd + "'" + a.getValorPagar() + "', ";
        cmd = cmd + "'" + a.getDataLimitePagamento() + "', ";
        cmd = cmd + "'" + carrinha + "') ";
        stm.executeQuery(cmd);
    }
}