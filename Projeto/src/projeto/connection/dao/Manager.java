
package projeto.connection.dao;


import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.Main;
import projeto.model.Projeto;
import projeto.model.Usuario;

public class Manager {


    private Usuario usuarioLogado;


    private final UsuarioDAO uDao;
    private final MensagemIndividualDAO mIndiDAO;
    private final ProjetoDAO proDAO;
    private final MensagemColetivaDAO mColeDAO;

    public Manager(){
        this.uDao = new UsuarioDAO();
        this.mIndiDAO = new MensagemIndividualDAO();
        this.proDAO = new ProjetoDAO();
        this.mColeDAO = new MensagemColetivaDAO();
    }

    public void criarTabelas(){
        //this.dao.createTable();
        this.uDao.createTable();
        this.mIndiDAO.createTable();
        this.proDAO.createTable();
        this.mColeDAO.createTable();
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public ProjetoDAO getProjetoDAO() {
        return proDAO;
    }

    public MensagemColetivaDAO getmColeDAO() {
        return mColeDAO;
    }

    public MensagemIndividualDAO getmIndiDAO() {
        return mIndiDAO;
    }

    public UsuarioDAO getUsuarioDao() {
        return uDao;
    }
    
    public void criarProjeto(Projeto projeto){
        this.proDAO.addProjetoToDatabase(projeto);
    }
    
    public void criarUsuario(Usuario usuario){
        this.uDao.addUsuarioToDatabase(usuario);
    }
    
    public boolean existeUsuario(String userName){
        return this.uDao.getTodosUsuarios().stream().anyMatch(r-> r.getUserName().equalsIgnoreCase(userName));
    }

    public boolean existeUsuario(int id){
        return this.uDao.getTodosUsuarios().stream().anyMatch(r-> r.getId() == id);
    }

    public Usuario getUsuarioByUserName(String userName){
        if(!existeUsuario(userName)) return null;
        return 
            this.uDao.getTodosUsuarios().stream().filter(r-> r.getUserName().equalsIgnoreCase(userName)).findFirst().get();
    }

    public Usuario getUsuarioByID(int id){
        return this.uDao.getTodosUsuarios().stream().filter(r-> r.getId() == id).findFirst().get();
    }

    public boolean existeProjeto(String projeto){
        return this.proDAO.getTodosProjetos().stream().anyMatch(r->r.getNome().equalsIgnoreCase(projeto));
    }

    public Projeto getProjetoByName(String projeto){
        if(!existeProjeto(projeto)) return null;
        return 
            this.proDAO.getTodosProjetos().stream().filter(r->r.getNome().equalsIgnoreCase(projeto)).findFirst().get();
    }

    public String transformarData(long data){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        return simpleDateFormat.format(data);
    }
    
    public long destransformarData(String data){
        if(data.contains("às")) data = data.replace("às", "-");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        try {
            return simpleDateFormat.parse(data).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
}
