public class Quest5_SUAP {

    public static void main(String[] args){
        Quest5_discente Larissa = new Quest5_discente("LARISSA SILVA NUNES", "000.535.559-71");
        Larissa.n1 = 10.00;
        Larissa.n2 = 10.00;
        Larissa.n3 = 10.00;
        double media;
        media = Larissa.Media_discente();
        System.out.println("Media da aluna "+Larissa.nome+": "+media);
        Larissa.n2 = 0;
        media = Larissa.Media_discente();
        System.out.println("Media da aluna "+Larissa.nome+": "+media);
    }
}
