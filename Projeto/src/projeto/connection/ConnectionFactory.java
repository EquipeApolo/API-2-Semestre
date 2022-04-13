
package projeto.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection connection;

    public ConnectionFactory() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/projeto", "root", "fatec");
    }

    public Connection getConnection(){
        return this.connection;
    }


    public void closeConnection(){
        try {
            this.connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
