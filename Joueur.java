import java.util.ArrayList;
import java.lang.Math;

class Joueur{
    private Paquet as;
    private Paquet jeuDuJoueur;
    private String statut;
    public Paquet paquetDePartie;

    public Joueur(JeuDeCarte jdc){
        this.jeuDuJoueur = new Paquet(jdc);
        this.as = new Paquet();
        this.statut = "Joueur normal";
        this.paquetDePartie = new Paquet();
    }

    public Joueur(JeuDeCarte jdc, String message){
        this.jeuDuJoueur = new Paquet(jdc);
        this.as = new Paquet().paquetAS();
        this.statut = message;
        this.paquetDePartie = new Paquet();
    }

    public boolean peutJouer(){
        return !jeuDuJoueur.estVide();
    }

    public void jouerCarte(){
        paquetDePartie.ajouterCarte(jeuDuJoueur.poserCarte());
    }

    public void dissimulerMauvaiseCarte(){
        jeuDuJoueur.jeterCarte();
    }

    public int donnerVa

}