package projeto;

import projeto.connection.dao.Manager;
import projeto.connection.ConnectionFactory;
import projeto.GUI.menu.TelaLogin;

import java.sql.SQLException;

public class Main {

    private static ConnectionFactory connectionFactory;
    private static Manager manager;

    public static void main(String[] args){

        try{

            connectionFactory = ConnectionFactory.getInstance();
            manager = Manager.getInstance();

        }catch(SQLException e){
            System.exit(0);
            return;
        }

        manager.criarTabelas();

        new TelaLogin().setVisible(true);

    }

    public static ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public static Manager getManager() {
        return manager;
    }
}
