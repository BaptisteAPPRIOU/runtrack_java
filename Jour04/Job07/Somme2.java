package Jour04.Job07;

import java.util.Scanner;

public class Somme2 {
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
        int moitie = taille / 2;
        int[] moitie1 = new int[moitie];
        int[] moitie2 = new int[taille - moitie];
        System.arraycopy(tableau, 0, moitie1, 0, moitie);
        System.arraycopy(tableau, moitie, moitie2, 0, taille - moitie);
        SommeThread thread1 = new SommeThread(moitie1);
        SommeThread thread2 = new SommeThread(moitie2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        somme = thread1.getSomme() + thread2.getSomme();
        long fin = System.nanoTime(); // Temps de fin de l'exécution
        System.out.println("Somme totale: " + somme);
        System.out.println("Temps d'exécution: " + (fin - debut) + " nanosecondes");
        scanner.close();
    }
}

class SommeThread extends Thread {
    private int[] tableau;
    private int somme;
    public SommeThread(int[] tableau) {
        this.tableau = tableau;
    }
    public int getSomme() {
        return somme;
    }
    @Override
    public void run() {
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
    }
}
