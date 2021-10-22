import java.util.ArrayList;
import java.lang.Math;

class Carte{
    private int valeurSymbol;
    private String couleur;
    private String nom;
    
    public Carte(int n){
        String c[] = {"coeur", "carreaux", "piques", "trèfles"};
        String nom[] = {"deux", "trois", "quatre", "cinque", "six", "sept", "huit", "neuf", "dix", "Valet", "Dame","Roi", "As"};

        this.valeurSymbol = n%13;
        int indice = n/13;
        this.couleur = c[indice];
        this.nom = nom[n%13];
    }
    public int donnerValeurSymbolique(){
        return valeurSymbol;
    }
    public void afficheCarte(){
        System.out.print("( " + couleur + " | " + nom + " ),  ");
    }
    public static void main (String [] arg){
        Carte c1 = new Carte(5);
        c1.afficheCarte();
    }
}