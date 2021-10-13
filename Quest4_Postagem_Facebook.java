public class Quest4_Postagem_Facebook {
    public static void main(String[] args){
        Quest4_Postagem amazonia = new Quest4_Postagem("'Salve-me', disse a Amazonia", "https://www.instagram.com");
        amazonia.Dar_curtida();
        amazonia.Dar_curtida();
        amazonia.Dar_curtida();
        System.out.println("Quantidade de curtidas: "+amazonia.numeroCurtidas);
        amazonia.compartilhar();
        amazonia.compartilhar();
        System.out.println("Quantidade de compartilhamentos: "+amazonia.numeroCompartilhamento);
    }
}
