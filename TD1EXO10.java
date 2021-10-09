import java.util.Scanner;

class vecteur{
    double norme ;
    int x;
    int y;
    int z;
   
    vecteur(double n, int a, int b, int c){
        norme = n;
        x = a;
        y = b;
        z = c;
    }
    void afficher(){
        System.out.println("\nLes cordonnées du vecteur sont : ");
        System.out.println("x = " + x + "\n" + "y = " + y + "\n" + "z = " + z);
        System.out.println("La norme du vecteur est  : " + norme);
    }
    void calculNorme(){
        double val = x*x + y*y + z*z;
        norme = Math.sqrt(val);
    }
    static vecteur sommeVecteurs(vecteur v1, vecteur v2){
        vecteur v3 = new vecteur(0,0,0,0);
        v3.x = v1.x + v2.x;
        v3.y = v1.y + v2.y;
        v3.z = v1.z + v2.z;
        v3.calculNorme();
        return v3;
    }
    static int scalaire(vecteur v1, vecteur v2){
        return v1.x * v2.x + v1.y * v2.y + v1.z*v2.z;
    }
    

    public static void main (String args[]) {
        Scanner entree  =  new Scanner(System.in);
        vecteur v1 = new vecteur(0,0,0,0);
        vecteur v2 = new vecteur(0,0,0,0);
        System.out.println("Vueillez saisir les coordonnées de vos deux vecteurs : ");
        System.out.print("x = ");
        v1.x = entree.nextInt();
        System.out.print("\ny = ");
        v1.y = entree.nextInt();
        System.out.print("\nz = ");
        v1.z = entree.nextInt();
        v1.calculNorme();
        System.out.println("Vueillez saisir les coordonnées de vos deux vecteurs : ");
        System.out.print("x = ");
        v2.x = entree.nextInt();
        System.out.print("\ny = ");
        v2.y = entree.nextInt();
        System.out.print("\nz = ");
        v2.z = entree.nextInt();
        v2.calculNorme();
        System.out.println("V1 : ");
        v1.afficher();
        System.out.println("V2 : ");
        v2.afficher();
        System.out.println("Produit scalaire des deux vecteurs  : V1.V2 =  " + scalaire(v1, v2));
        vecteur v3 = new vecteur(0,0,0,0);
        v3 = sommeVecteurs(v1, v2);
        System.out.println("Le vecteur somme des deux vecteurs V1 et V2 est : ");
        v3.afficher();
        


    }
}

