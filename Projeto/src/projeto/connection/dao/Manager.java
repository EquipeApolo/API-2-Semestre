
package projeto.connection.dao;


import java.text.ParseException;
import projeto.model.Mensagem;


import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager {

    private final MensagemDAO dao;
    private final UsuarioDAO uDao;
    private final MensagemIndividualDAO mIndiDAO;
    private final ProjetoDAO proDAO;
    private final MensagemColetivaDAO mColeDAO;

    public Manager(){
        this.dao = new MensagemDAO();
        this.uDao = new UsuarioDAO();
        this.mIndiDAO = new MensagemIndividualDAO();
        this.proDAO = new ProjetoDAO();
        this.mColeDAO = new MensagemColetivaDAO();
    }

    public MensagemDAO getMensagemDAO(){
        return this.dao;    
    }

    public void criarTabelas(){
        //this.dao.createTable();
        this.uDao.createTable();
        this.mIndiDAO.createTable();
        this.proDAO.createTable();
        this.mColeDAO.createTable();
    }

    public void cadastrarMensagem(Mensagem mensagem){
        this.dao.addMensagemToDatabase(mensagem);
    }

    public void deletarMensagem(int id_mensagem){
        this.dao.deleteMensagemFromDatabase(id_mensagem);
    }

    public void deletarMensagem(Mensagem mensagem){
        this.dao.deleteMensagemFromDatabase(mensagem.getId());
    }

    public List<Mensagem> pegarTodasMensagens(){
        return this.dao.getTodasMensagens();
    }

    public List<Mensagem> pegarMensagensPorQuemEnviou(String quemEnviou){
        return this.dao.getMensagensPorQuemEnviou(quemEnviou);
    }

    public List<Mensagem> pegarMensagensPorCliente(String cliente){
        return this.dao.getMensagensPorCliente(cliente);
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
