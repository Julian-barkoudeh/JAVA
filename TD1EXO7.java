import java.util.Scanner;

class trinome{
    double a;
    double b;
    double c;

    trinome( double a, double b, double c){
        this.a = a;
        this.b  = b;
        this.c = c;
    }

    double calculeDelta(){

        return b*b - 4*a*c; 
    }

    double[] calculRacines(){
        double racines[] = new double[2];
        double delta = calculeDelta();
        racines[0] = (-b + Math.sqrt(delta))/(2*a); 
        racines[1] = (-b - Math.sqrt(delta))/(2*a); 
        return racines;
    }

    String[] calculRacinesIma(){
        String racines[]  = new String[2];
        double delta = calculeDelta();
        racines[0] = "(-" + b + " + i*" + Math.sqrt(Math.abs(delta)) + ")) / " + 2*a;
        racines[1] = "(-" + b + " - i*" + Math.sqrt(Math.abs(delta)) + ")) / " + 2*a;
        return racines;
    }

    void afficheLesRacines(){
        double detla  = calculeDelta();

        if(detla >= 0){
            double racines[]  = calculRacines();
            if( racines[0] == racines[1]){
                System.out.println("La fonction ne possede qu'une solution  : \n" + "X = " + racines[0]);
            }
            else {
                System.out.println("La fonction possède deux solutions : \n" +"X1 = "  + racines[0] + "\n" + "X2= = "  + racines[1]);
            }
        }
        else{
            String racines[] = calculRacinesIma();
            System.out.println("La fonction possède des solution imaginaires  : " + "\n" + "X1 = "  + racines[0] + "\n" + "X2= = "  + racines[1]);
        }
    }
}

public class TD1EXO7 {
    public static void main (String args[]) {
        Scanner entree  =  new Scanner(System.in);
        System.out.print("a = ");
        double a = entree.nextDouble();
        System.out.print("b = ");
        double b = entree.nextDouble();
        System.out.print("c = ");
        double c = entree.nextDouble();

        trinome fonc_1 =  new trinome(a,b,c);
        System.out.println("\nF(x) = " + a + "X^2 " + b + "X " + c);
        System.out.println("Delta = " + fonc_1.calculeDelta());
        fonc_1.afficheLesRacines();
        
    }
    
}
