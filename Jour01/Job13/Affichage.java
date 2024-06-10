package Jour01.Job13;

public class Affichage {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int entier = scanner.nextInt();
        for (int i=0; i<=entier; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
