package Jour01.Job14;

public class Somme {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int entier = scanner.nextInt();
        System.out.print("Entrez un autre nombre entier : ");
        int entier2 = scanner.nextInt();
        scanner.close();

        int somme = entier + entier2;
        System.out.println("La somme de " + entier + " et " + entier2 + " est " + somme);
        scanner.close();
    }
}
