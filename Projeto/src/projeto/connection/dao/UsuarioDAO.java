
package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import projeto.Main;


public class UsuarioDAO {
        public static void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios(id int AUTO_INCREMENT, nome varchar(30) not null, senha varchar(30) not null, tipousuario int, idprojetos int, PRIMARY KEY (id), foreign key(idprojetos) references projetos(id)) DEFAULT CHARSET=utf8;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
}
