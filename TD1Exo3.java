class TD1Exo3 {
    public static void main (String args[]) {
        String Arguments[];
        Arguments = args;
        for(int i = 0; i< Arguments.length; i++){
            System.out.println("Argument " + i + ": " + Arguments[i] );
        }
    }
}

/* Proposition du prof 
    public class LigneDeCommande{
        public class void main( String agrs[]){
            int nbarg = args.length;
            System.out.print(nbarg);
            for(int i = 0; i< nbarg; i++){
                system.out.print(args[i]);
            }
        }
    }
*/