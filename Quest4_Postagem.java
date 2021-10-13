public class Quest4_Postagem {
    String text, link;
    int numeroCurtidas, numeroCompartilhamento;
    public Quest4_Postagem(String text, String link){
        this.text = text;
        this.link = link;
    }
    public void Dar_curtida(){
        this.numeroCurtidas+=1;
    }
    public void compartilhar(){
        this.numeroCompartilhamento+=1;
    }
}
