package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Main;
import projeto.model.MensagemColetiva;

public class MensagemColetivaDAO {
    
    // Destinatário da Mensagem Coletiva é o ID do Projeto.
    
        public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS mensagem_coletiva(id int AUTO_INCREMENT, idremetente int, idprojeto int, meio varchar(20) not null, conteudo text not null, data_horario bigint not null, PRIMARY KEY (id), foreign key(idremetente) references usuarios(id), foreign key(idprojeto) references projetos(id) ) DEFAULT CHARSET=utf8;"; 
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
        
    public void addMensagemToDatabase(MensagemColetiva mensagem){
        String sql = "INSERT INTO mensagem_coletiva(idremetente,idprojeto,meio,conteudo,data_horario) VALUES (?,?,?,?,?);";
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
        String sql = "DELETE FROM mensagem_coletiva WHERE id = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, id_mensagem);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteMensagemPorProjetoFromDatabase(int idprojeto){
        String sql = "DELETE FROM mensagem_coletiva WHERE idprojeto = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, idprojeto);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteMensagemPorUsuarioFromDatabase(int iddestinatario){
        String sql = "DELETE FROM mensagem_coletiva WHERE idprojeto = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, iddestinatario);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<MensagemColetiva> getTodasMensagens(){
        List<MensagemColetiva> listaMensagens = new ArrayList<>();
        String sql = "SELECT * FROM mensagem_coletiva;";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemColetiva mensagem = new MensagemColetiva(
                        resultSet.getInt("idremetente"), 
                        resultSet.getInt("idprojeto"),
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );

                mensagem.setId(resultSet.getInt("int"));
                
                listaMensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return listaMensagens;
    }

    public List<MensagemColetiva> getMensagensPorDestinatario(int idDestinatario){
        List<MensagemColetiva> mensagens = new ArrayList<>();
        
        String sql = "SELECT * FROM mensagem_coletiva where idprojeto like '%"+idDestinatario+"%'";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemColetiva mensagem = new MensagemColetiva(
                        resultSet.getInt("idremetente"),
                        resultSet.getInt("idprojeto"), 
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );

                mensagem.setId(resultSet.getInt("int"));
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
    
    public List<MensagemColetiva> getMensagensPorRemetente(int id){
        List<MensagemColetiva> mensagens = new ArrayList<>();
        
        String sql = "SELECT * FROM mensagem_coletiva where idremetente like '%"+id+"%'";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                MensagemColetiva mensagem = new MensagemColetiva(
                        resultSet.getInt("idremetente"),
                        resultSet.getInt("idprojeto"), 
                        resultSet.getString("meio"), 
                        resultSet.getString("conteudo"), 
                        resultSet.getLong("data_horario")
                );

                mensagem.setId(resultSet.getInt("int"));
                mensagens.add(mensagem);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return mensagens;
    }
}
