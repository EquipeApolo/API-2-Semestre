
package projeto;

import projeto.connection.dao.Manager;
import projeto.connection.ConnectionFactory;
import projeto.connection.dao.MensagemDAO;

import java.sql.SQLException;

import projeto.GUI.MenuPrincipal;

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

        MensagemDAO.createTable();
        
        MenuPrincipal menuPrincipal = new MenuPrincipal();

        menuPrincipal.setVisible(true);

//        //teste
//        manager.cadastrarMensagem(new Mensagem("Pro4Tech", "Jennifer", "SMS", "Boa tarde, tudo bem? :D", System.currentTimeMillis()));
//
//        for(Mensagem mensagem : manager.pegarTodasMensagens()){
//            System.out.println("Horário: " + manager.transformarData(mensagem.getData()) + "; mensagem: " + mensagem.getConteudo());
//        }
//
//        //fim do teste

    }

    public static ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public static Manager getManager() {
        return manager;
    }
}
