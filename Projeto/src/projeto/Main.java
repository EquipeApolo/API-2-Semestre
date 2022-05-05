
package projeto;

import projeto.connection.dao.UsuarioDAO;
import projeto.connection.dao.ProjetoDAO;
import projeto.connection.dao.MensagemIndividualDAO;
import projeto.connection.dao.MensagemColetivaDAO;


import projeto.connection.dao.Manager;
import projeto.connection.ConnectionFactory;

import java.sql.SQLException;

import projeto.GUI.menu.MenuPrincipal;
import projeto.GUI.menu.MenuPrincipal_Suporte;

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
        
        MenuPrincipal_Suporte menuPrincipal_suporte = new MenuPrincipal_Suporte();

        menuPrincipal_suporte.setVisible(true);

    }

    public static ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public static Manager getManager() {
        return manager;
    }
}
