import java.util.Scanner;

class Calcul_Listes_Parfaits{
    static boolean ifparfait(int x){
        int cpt = 0;
        int diviseurs[] = new int[10000];
        int res = 0;
        for(int i=1; i<= x/2; i++ ){
            if(x%i == 0){
                diviseurs[cpt] = i;
                cpt++;
                res = res + i;
            }
        }
        if(res == x){
            System.out.print(x + "= ");
            for(int i = 0; i< diviseurs.length ; i++){
                if(diviseurs[i] == 0){
                    break;
                }
                if(i == 0){
                    System.out.print(diviseurs[i] + " ");
                }
                else if (i>0){
                    System.out.print("+ " + diviseurs[i] + " ");
                }
                
            }
            System.out.print("\n");
            return true;
        }
        else{
            return false;
        }
        
    }
}

public class TD1EXO2 {
    public static void main (String args[]) {
        Scanner entree  =  new Scanner(System.in);

        for(int i = 1; i<=100000; i++){
            Calcul_Listes_Parfaits.ifparfait(i);
        }
    }
}
