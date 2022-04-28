
package projeto.connection.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import projeto.Main;


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
}
