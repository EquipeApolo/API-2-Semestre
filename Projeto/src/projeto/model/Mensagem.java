package projeto.model;

public class Mensagem {

    private int id;
    private int idDestinatario;
    private String meio;
    private String conteudo;
    private long data;

    public Mensagem(int dest, String meioContato, String mensagem, long horario){
        this.idDestinatario = dest;
        this.meio = meioContato;
        this.conteudo = mensagem;
        this.data = horario;
    }

    public Mensagem(int id, int dest, String meioContato, String mensagem, long horario){
        this.idDestinatario = dest;
        this.meio = meioContato;
        this.conteudo = mensagem;
        this.data = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public long getData() {
        return data;
    }

    public String getMeio() {
        return meio;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void setMeio(String meio) {
        this.meio = meio;
    }

}
