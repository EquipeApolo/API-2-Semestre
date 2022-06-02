package projeto.model;

public class MensagemIndividual extends Mensagem{
    
    private int idRemetente;
    
    public MensagemIndividual(Mensagem mensagem, int idRemetente){
        super(mensagem.getIdDestinatario(), mensagem.getMeio(), mensagem.getConteudo(), mensagem.getData());
        this.idRemetente = idRemetente;
    }

    public MensagemIndividual(int id, int remetente, int destinatario, String meio, String conteudo, long data){
        super(id, destinatario, meio, conteudo, data);
        this.idRemetente = remetente;
    }
    
    public MensagemIndividual(int remetente, int destinatario, String meio, String conteudo, long data){
        super(destinatario, meio, conteudo, data);
        this.idRemetente = remetente;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }
    
}
