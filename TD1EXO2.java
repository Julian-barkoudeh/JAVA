

class Calcul_Listes_Parfaits{
    static void ifparfait(int x){
    
        String div = "1";
        int res = 1;
        for(int i=2; i<= x/2; i++ ){
            if(x%i == 0){
                div = div + " + "  + i;
                res = res + i;
            }
        }
        if(res == x){
            System.out.println(x + "= " + div);
            
        }
    }
}

public class TD1EXO2 {
    public static void main (String args[]) {
       
        for(int i = 2; i<=100000; i++){
            Calcul_Listes_Parfaits.ifparfait(i);
        }
    }
}
