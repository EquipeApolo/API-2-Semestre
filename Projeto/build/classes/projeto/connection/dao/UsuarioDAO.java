
package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projeto.Main;
import projeto.model.Usuario;
import projeto.model.tipos.FuncaoUsuario;


public class UsuarioDAO {
    
    
    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios(id int AUTO_INCREMENT, nome varchar(30) not null, senha varchar(30) not null, funcaousuario int, PRIMARY KEY (id)) DEFAULT CHARSET=utf8;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    
    public void addUsuarioToDatabase(Usuario usuario){
        String sql = "INSERT INTO usuarios(nome,senha,funcaousuario) VALUES (?,?,?);";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());
            statement.setInt(3, usuario.getFuncaoUsuario());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteUsuario(int idusuario){
        String sql = "DELETE FROM usuarios WHERE id = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, idusuario);

            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void trocarFuncaoUsuario(int idusuario, FuncaoUsuario funcao){
        String sql = "UPDATE usuarios SET funcaousuario = ? WHERE id = ?;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.setInt(1, funcao.getId());
            statement.setInt(2, idusuario);
            
            statement.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<Usuario> getTodosUsuarios(){
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios;";
       
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Usuario usuario = new Usuario(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("senha"),
                        resultSet.getInt("funcaousuario")
                );
                
                lista.add(usuario);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return lista;
    }
}
