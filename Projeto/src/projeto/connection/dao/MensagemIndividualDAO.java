
package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Main;
import projeto.model.MensagemIndividual;

public class MensagemIndividualDAO {
    
    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS mensagem_individual(id int AUTO_INCREMENT, idremetente int, iddestinatario int, meio varchar(20) not null, conteudo text not null, data_horario bigint not null, PRIMARY KEY (id), foreign key(idremetente) references usuarios(id), foreign key(iddestinatario) references usuarios(id) ) DEFAULT CHARSET=utf8;"; // iddestinatario 
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        
    }
    
    public void addMensagemToDatabase(MensagemIndividual mensagem){
        String sql = "INSERT INTO mensagem_individual(idremetente,iddestinatario,meio,conteudo,data_horario) VALUES (?,?,?,?,?);";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, mensagem.getIdDestinatario());
            statement.setInt(2, mensagem.getIdRemetente());
            statement.setString(3, mensagem.getMeio());
            statement.setString(4, mensagem.getConteudo());
            statement.setLong(5, mensagem.getData());

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteMensagemFromDatabase(int id_mensagem){
        String sql = "DELETE FROM mensagem_individual WHERE id = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, id_mensagem);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<MensagemIndividual> getTodasMensagens(){
        List<MensagemIndividual> listaMensagens = new ArrayList<>();
        String sql = "SELECT * FROM mensagem_individual;";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemIndividual mensagem = new MensagemIndividual(
                        resultSet.getInt("idremetente"), 
                        resultSet.getInt("iddestinatario"),
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

    public List<MensagemIndividual> getMensagensPorDestinatario(int idDestinatario){
        List<MensagemIndividual> mensagens = new ArrayList<>();
        
        String sql = "SELECT * FROM mensagem_individual where iddestinatario like '%"+idDestinatario+"%'";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemIndividual mensagem = new MensagemIndividual(
                        resultSet.getInt("idremetente"),
                        resultSet.getInt("iddestinatario"), 
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
    
    public List<Integer> getTeste(int idUsuario){
        
        List<Integer> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM mensagem_individual where idremetente like '%" + idUsuario + "%'";
        
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                if(!lista.contains(resultSet.getInt("iddestinatario"))){
                    lista.add(resultSet.getInt("iddestinatario"));
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        sql = "SELECT * FROM mensagem_individual where iddestinatario like '%" + idUsuario + "%'";
        
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                if(!lista.contains(resultSet.getInt("idremetente"))){
                    lista.add(resultSet.getInt("idremetente"));
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return lista;
    }
    
    public List<MensagemIndividual> getMensagens(int user1, int user2){
        List<MensagemIndividual> mensagens = new ArrayList<>();
        
        String sql = "SELECT * FROM mensagem_individual where idremetente = '" + user1 + "' and iddestinatario = '" + user2 + "'";
        
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemIndividual mensagem = new MensagemIndividual(
                        resultSet.getInt("idremetente"),
                        resultSet.getInt("iddestinatario"), 
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        sql = "SELECT * FROM mensagem_individual where idremetente = '" + user2 + "' and iddestinatario = '" + user1 + "'";
        
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemIndividual mensagem = new MensagemIndividual(
                        resultSet.getInt("idremetente"),
                        resultSet.getInt("iddestinatario"), 
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return mensagens;
    }
    
    public List<MensagemIndividual> getMensagensPorRemetente(int id){
        List<MensagemIndividual> mensagens = new ArrayList<>();
        
        String sql = "SELECT * FROM mensagem_individual where idremetente like '%"+id+"%'";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemIndividual mensagem = new MensagemIndividual(
                        resultSet.getInt("idremetente"),
                        resultSet.getInt("iddestinatario"), 
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
   
}
