public class TD2EXO1 {
    public static void main (String [] arg){
        String uneChaine = "le java à polytech, c'est top";
        String unMessage = "le java à polytech, c'est top";
        String un = "le java à polytech, ";
        String messageCoupe = "c'est top";
        String messageColle = "le java à polytech," + " c'est top";
        String autosatisfaction = un + messageCoupe;
        String propagande = new String("le java à polytech, c'est top");
        String leitmotiv = new String("le java à polytech, c'est top");
        System.out.println("blabla" + (uneChaine == unMessage)); // le programme donne le même adresse memoire aux deux chaines car elles sont identiques
        System.out.println("blabla" + (uneChaine == messageColle));
        System.out.println("autosatisfaction :(" + autosatisfaction + ")"); // On compare les pointeurs, et dans ce cas la chaine autosatisfaction a une adresse memoire different 
        System.out.println("messageColle :(" + messageColle + ")");
        System.out.println("blabla" + (uneChaine == autosatisfaction));
        System.out.println("blabla" + (uneChaine == propagande));
        System.out.println("blabla" + (uneChaine == leitmotiv));
    }
}
