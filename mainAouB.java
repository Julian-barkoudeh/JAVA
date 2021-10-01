import java.util.Scanner;
class A {
	public static void main(String args[]) {
		System.out.println("Méthode main() de la classe A");
	}
}     

class B {
	public static void main(String args[]) {
		System.out.println("Méthode main() de la classe B");
	}
}

class SortieTerminal {
    public static void main (String args[]) {
        // Sortie JAVA.
        System.out.println("Le système solaire comporte");
        int nbPlaneteTellurique = 4;
        int nbPlaneteGazeuse = 4;
        System.out.print("_ " + nbPlaneteTellurique + " planètes telluriques,\n");
        System.out.println("_ " + nbPlaneteGazeuse + " planètes gazeuses.");
        // Sortie JAVA façon langage C.
        String message = "Pluton n'est plus une planète !";
        System.out.printf("%s\n", message);
    }
}

class EntreeTerminal {
    public static void main(String args[]) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quel âge a le système solaire (en Ma) ?");
        double age = clavier.nextDouble();
        System.out.println("Où se trouve la ceinture d'astéroı̈des ?");
        clavier.nextLine(); // Bogue si retrait.
        String reponse = clavier.nextLine();
        System.out.println("Vos réponses : " + age + " " + reponse);
    }
}