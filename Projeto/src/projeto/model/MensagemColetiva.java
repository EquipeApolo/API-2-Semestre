package projeto.model;

public class MensagemColetiva extends Mensagem{
    
    private int idRemetente;
    
    public MensagemColetiva(Mensagem mensagem, int idRemetente){
        super(mensagem.getIdDestinatario(), mensagem.getMeio(), mensagem.getConteudo(), mensagem.getData());
        this.idRemetente = idRemetente;
    }
    
    public MensagemColetiva(int remetente, int destinatario, String meio, String conteudo, long data){
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
