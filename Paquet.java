import java.util.ArrayList;
import java.lang.Math;
class Paquet{
    private ArrayList<Carte> paquetCarte;
    private boolean estVide;

    public Paquet(){
        this.paquetCarte = new ArrayList<>();
        this.estVide = true;
    }

    public Paquet (JeuDeCarte unJeu){
        this.paquetCarte = new ArrayList<>();
        for(int i =0; i< 26; i++){
            this.paquetCarte.add(i, unJeu.distribuerCarte());
        }
        this.estVide = false;
    }

    public Paquet paquetAS(){
        Paquet  paquetAs = new Paquet();
        Carte cAs;
        int cpt = 12;
        for(int i = 0; i<4; i++){
            cAs = new Carte(cpt);
            paquetAs.paquetCarte.add(i, cAs);
            cpt += 13;
        }
        return paquetAs;
    }

    public Carte poserCarte(){
       return  paquetCarte.remove(0);
    }

    public void jeterCarte(){
        paquetCarte.remove(0);
    }

    public void ajouterCarte(Carte c){
        this.paquetCarte.add(c);
    }

    public void ajouterPaquet(Paquet p){
        for(int i =0; i< p.paquetCarte.size(); i++){
            paquetCarte.add(p.paquetCarte.get(i));
        }
    }

    public Carte consulterDernireCarte(){
        return paquetCarte.get(paquetCarte.size()-1);
    }

    public Carte consulterPremireCarte(){
        return paquetCarte.get(0);
    }
    
    public boolean estVide(){
        return estVide;
    }

    public int donnerTaillePaquet(){
        return paquetCarte.size();
    }

    public void afficherPaquet(){
        for(int i = 0; i< paquetCarte.size(); i++){
            paquetCarte.get(i).afficheCarte();
        }
    }
    public static void main (String [] arg){
        JeuDeCarte jdc = new JeuDeCarte();
        Paquet p = new Paquet(jdc);
        for(int i = 0; i< 26; i++){
            p.ajouterCarte(jdc.distribuerCarte());
        }
        p.afficherPaquet();
        System.out.println("\n\n");
        Paquet pAs = new Paquet().paquetAS();
        pAs.afficherPaquet();
    }
    
}