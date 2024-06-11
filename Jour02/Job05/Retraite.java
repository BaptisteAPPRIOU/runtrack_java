package Jour02.Job05;

public class Retraite {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Entrez votre âge: ");
        int age = input.nextInt();
        if (age < 16) {
            System.out.println("Vous êtes trop jeune pour travailler.");
        } else if (age >= 16 && age <= 55) {
            System.out.println("Vous êtes en âge de travailler.");
        } else if (age > 55 && age < 67) {
            System.out.println("Vous êtes en âge de partir à la retraite.");
        } else if (age > 67) {
            System.out.println("Vous êtes à la retraite.");
        }
        input.close();
    }
}
