
package projeto.connection.dao;


import java.text.ParseException;
import projeto.connection.dao.MensagemDAO;
import projeto.model.Mensagem;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager {

    public Manager(){

    }

    public void cadastrarMensagem(Mensagem mensagem){
        MensagemDAO.addMensagemToDatabase(mensagem);
    }

    public void deletarMensagem(int id_mensagem){
        MensagemDAO.deleteMensagemFromDatabase(id_mensagem);
    }

    public void deletarMensagem(Mensagem mensagem){
        MensagemDAO.deleteMensagemFromDatabase(mensagem.getId());
    }

    public List<Mensagem> pegarTodasMensagens(){
        return MensagemDAO.getTodasMensagens();
    }

    public String transformarData(long data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        return simpleDateFormat.format(data);
    }
    
    public long destransformarData(String data){
        data = data.replace("às", "-");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        try {
            return simpleDateFormat.parse(data).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
}
