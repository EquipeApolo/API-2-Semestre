
package projeto;

import projeto.connection.ConnectionFactory;
import projeto.connection.dao.MensagemDAO;
import projeto.model.Mensagem;

import java.sql.SQLException;

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

//        //teste
//        manager.cadastrarMensagem(new Mensagem("Pro4Tech", "SMS", "Boa tarde, tudo bem? :D", System.currentTimeMillis()));
//
//        for(Mensagem mensagem : manager.pegarTodasMensagens()){
//            System.out.println("Horário mensagem: " + manager.transformarData(mensagem.getData()));
//        }
//
//        //fim do teste
//
//        connectionFactory.closeConnection();
    }

    public static ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public static Manager getManager() {
        return manager;
    }
}
