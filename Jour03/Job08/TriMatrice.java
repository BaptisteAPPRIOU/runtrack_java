package Jour03.Job08;

public class TriMatrice {
    public static void main(String[] args) {
        int[][] tableau = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};

        // Tri des éléments de chaque ligne
        for (int i = 0; i < tableau.length; i++) {
            java.util.Arrays.sort(tableau[i]);
        }

        // Transposition de la matrice
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                int temp = tableau[i][j];
                tableau[i][j] = tableau[j][i];
                tableau[j][i] = temp;
            }
        }

        // Tri des éléments de chaque colonne
        for (int i = 0; i < tableau.length; i++) {
            java.util.Arrays.sort(tableau[i]);
        }

        // Affichage de la matrice triée
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
    }
}
