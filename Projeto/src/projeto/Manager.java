
package projeto;


import projeto.connection.dao.MensagemDAO;
import projeto.model.Mensagem;

import java.text.SimpleDateFormat;
import java.util.List;

public class Manager {

    public Manager(){

    }

    public void cadastrarMensagem(Mensagem mensagem){
        MensagemDAO.addMensagemToDatabase(mensagem);
    }

    public List<Mensagem> pegarTodasMensagens(){
        return MensagemDAO.getAllMensagens();
    }

    public String transformarData(long data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        return simpleDateFormat.format(data);
    }
}
