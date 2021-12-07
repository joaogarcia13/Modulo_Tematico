import java.sql.*;
import static java.sql.DriverManager.*;

public class Database{
    private Connection cnn;
    private Statement stm;
    public void openConnection() throws SQLException {
            cnn = getConnection("jdbc:mysql://localhost:3306",
                    "teste",
                    "123456Abc");
            stm = cnn.createStatement();
    }
    public ResultSet select(String cmd) throws SQLException {
        ResultSet rs = stm.executeQuery(cmd);
        try{
            stm.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
}