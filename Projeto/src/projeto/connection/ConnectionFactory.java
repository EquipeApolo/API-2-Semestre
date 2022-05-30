package projeto.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final Connection connection;
    private static ConnectionFactory instance = null;

    public static ConnectionFactory getInstance() throws SQLException{
        if(instance == null) instance = new ConnectionFactory();
        return instance;
    }

    private ConnectionFactory() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://dbfatec.mysql.database.azure.com:3306/projetoapi?user=fatec&password=projeto@1");
    }

    public Connection getConnection(){
        return this.connection;
    }


    public void closeConnection(){
        try {
            this.connection.close();
        }catch(SQLException e){
        }
    }
}
