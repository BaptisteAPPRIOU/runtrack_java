package Jour01.Job12;

public class Echange {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Entrez la première chaine de caractères : ");
        String chaine1 = scanner.nextLine();
        System.out.println("Entrez la deuxième chaine de caractères : ");
        String chaine2 = scanner.nextLine();
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);
        scanner.close();
    }
}
