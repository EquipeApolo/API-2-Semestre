
package projeto.connection.dao;


import projeto.Main;
import projeto.model.Mensagem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.connection.ConnectionFactory;

public class MensagemDAO {

    public static void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS mensagem(id int AUTO_INCREMENT, quem_enviou varchar(30), cliente varchar(30) not null, meio varchar(20) not null, conteudo text not null, data_horario bigint not null, PRIMARY KEY (id)) DEFAULT CHARSET=utf8;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }


    public static void addMensagemToDatabase(Mensagem mensagem){
        String sql = "INSERT INTO mensagem(meio,quem_enviou,cliente,conteudo,data_horario) VALUES (?,?,?,?,?);";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setString(1, mensagem.getMeio());
            statement.setString(2, mensagem.getQuemEnviou());
            statement.setString(3, mensagem.getNomeCliente());
            statement.setString(4, mensagem.getConteudo());
            statement.setLong(5, mensagem.getData());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


	public static void deleteMensagemFromDatabase(int id_mensagem){
        String sql = "DELETE FROM mensagem WHERE id = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, id_mensagem);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static List<Mensagem> getTodasMensagens(){
        List<Mensagem> listaMensagens = new ArrayList<>();
        String sql = "SELECT * FROM mensagem;";
       
        try{
            ConnectionFactory factory = new ConnectionFactory();
            PreparedStatement statement = factory.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Mensagem mensagem = new Mensagem(
                        resultSet.getString("cliente"), 
                        resultSet.getString("quem_enviou"),
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );
                
                listaMensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return listaMensagens;
    }
    
    public static List<Mensagem> getMensagensPorQuemEnviou(String nomeQuemEnviou){
        List<Mensagem> mensagens = new ArrayList<>();
        
        if(nomeQuemEnviou.isBlank()){
            nomeQuemEnviou = "%";
        }
        
        String sql = "SELECT * FROM mensagem where quem_enviou like '%"+nomeQuemEnviou+"%'";
       
        try{
            ConnectionFactory factory = new ConnectionFactory();
            PreparedStatement statement = factory.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Mensagem mensagem = new Mensagem(resultSet.getString("cliente"), resultSet.getString("quem_enviou"), resultSet.getString("meio"), resultSet.getString("conteudo"), resultSet.getLong("data_horario"));
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
    
    public static List<Mensagem> getMensagensPorCliente(String nomeDoCliente){
        List<Mensagem> mensagens = new ArrayList<>();
        
        if(nomeDoCliente.isBlank()){
            nomeDoCliente = "%";
        }
        
        String sql = "SELECT * FROM mensagem where cliente like '%"+nomeDoCliente+"%'";
       
        try{
            ConnectionFactory factory = new ConnectionFactory();
            PreparedStatement statement = factory.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Mensagem mensagem = new Mensagem(resultSet.getString("cliente"), resultSet.getString("quem_enviou"), resultSet.getString("meio"), resultSet.getString("conteudo"), resultSet.getLong("data_horario"));
                mensagem.setId(resultSet.getInt("id"));
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
}