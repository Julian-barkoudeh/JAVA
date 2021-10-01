import java.util.Scanner;

class calculexp{
    static double puissance(int p, double x) {
        if(p == 0){
            return 1;
        }
        else{
            return x*puissance(p-1, x);
        }
    }
    static double fact(double num){
        if(num == 0){
            return 1;
        }
        else {
            return num*fact( num - 1);
        }

    }
    static double exponentielle (double x){
        double e = 0;
        for(int i = 0; i<20 ; i++){
            e = e + puissance(i,x)/fact(i);
        }
        return e;
        }
}
public class TD1EXO1 {
    public static void main (String args[]) {

    Scanner entree  =  new Scanner(System.in);
    System.out.print("X = ");
    Double x = entree.nextDouble();

    System.out.println( "Exp(" + x + ") = " + calculexp.exponentielle(x));

    }
}

class vrai_exp {
    public static void main (String args[]) {

        Scanner entree  =  new Scanner(System.in);
        System.out.print("X = ");
        Double x = entree.nextDouble();
    
        System.out.println( "Exp(" + x + ") = " + Math.exp(x));
    
        }
}