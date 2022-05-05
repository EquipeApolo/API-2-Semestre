
package projeto;

import projeto.connection.dao.Manager;
import projeto.connection.ConnectionFactory;

import java.sql.SQLException;

import projeto.GUI.menu.TelaLogin;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;


public class Main {

    private static ConnectionFactory connectionFactory;
    private static Manager manager;

    public static void main(String[] args){


        manager = new Manager();

        try{

            connectionFactory = new ConnectionFactory();

        }catch(SQLException e){
            e.printStackTrace();
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
