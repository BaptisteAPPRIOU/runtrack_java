package Jour02.Job07;

public class Factorielle {
    public static void main(String[] args) {
        int fact = 1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("La factorielle de " + n + " est " + fact);
        input.close();
    }
}
