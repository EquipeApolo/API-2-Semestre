
package projeto.connection.dao;


import projeto.Main;
import projeto.model.Mensagem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MensagemDAO {

    public static void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS mensagem(id int AUTO_INCREMENT, cliente varchar(30) not null, meio varchar(20) not null, conteudo text not null, data_horario bigint not null, PRIMARY KEY (id)) DEFAULT CHARSET=utf8;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }


    public static void addMensagemToDatabase(Mensagem mensagem){
        String sql = "INSERT INTO mensagem(meio,cliente,conteudo,data_horario) VALUES (?,?,?,?);";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setString(1, mensagem.getMeio());
            statement.setString(2, mensagem.getNomeCliente());
            statement.setString(3, mensagem.getConteudo());
            statement.setLong(4, mensagem.getData());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Mensagem> getAllMensagens(){
        List<Mensagem> mensagens = new ArrayList<>();
        String sql = "SELECT * FROM mensagem;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Mensagem mensagem = new Mensagem(resultSet.getString("cliente"), resultSet.getString("meio"), resultSet.getString("conteudo"), resultSet.getLong("data_horario"));
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
}