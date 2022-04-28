
package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import projeto.Main;

public class Projeto {
     public static void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS projetos(id int AUTO_INCREMENT, nome varchar(30) not null, idcliente int, PRIMARY KEY (id), foreign key(idcliente) references cliente(id)) DEFAULT CHARSET=utf8;";
        try{
            PreparedStatement statement = Main.getConnectionFactory().getConnection().prepareStatement(sql);
            statement.execute();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
     
}
