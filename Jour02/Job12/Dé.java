package Jour02.Job12;

public class Dé {
    public static void main(String[] args) {
        int somme = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    somme++;
                    System.out.println("Les résultats possibles pour les dés sont : " + i + " " + j + " " + k);
                }
            }
        }
        System.out.println("Il y a " + somme + " résultats possibles pour trois dés.");
    }
}
