package Jour04.Job06;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau: ");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        System.out.println("Entrez les éléments du tableau:");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + ": ");
            tableau[i] = scanner.nextInt();
        }
        int somme = 0;
        long debut = System.nanoTime(); // Temps de début de l'exécution
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        long fin = System.nanoTime(); // Temps de fin de l'exécution
        System.out.println("Somme totale: " + somme);
        System.out.println("Temps d'exécution: " + (fin - debut) + " nanosecondes");
        scanner.close();
    }
}
