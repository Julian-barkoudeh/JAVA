import java.sql.Date;
import java.util.Calendar;
import java.util.spi.CalendarDataProvider;


class personne{
    int id ;
    String nom;
    String prenom;
    int  annee;
    int age;
    personne(int i,String n, String p, int an, int age){
        id = i;
        nom = n; 
        prenom = p;
        annee = an; 
        this.age = age;
    }
    void afficher(){
        System.out.println("Informations de la personne n°" + id + ":");
        System.out.println(prenom + " " + nom);
        System.out.println("Année de naissance : " + annee);
        System.out.println("Age : " + age);
    }
    void calculAge(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        age = year - annee;
    }

}

public class TD1EXO9 {
    public static void main (String args[]) {
        int id  = 0;
        personne tab[] = {
            new personne(id++,"BARKOUDEH", "Julian", 1999, 0),
            new personne(id++,"DOUZET", "Camille", 2000, 0)
        };
        for(int i = 0; i<tab.length; i++){
            tab[i].calculAge();
            tab[i].afficher();
        }
    }
    
}
