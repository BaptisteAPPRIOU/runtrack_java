package Jour01.Job10;

public class NomPrenom {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();
        String nomPrenom = prenom + " " + nom;
        System.out.println("Bonjour " + nomPrenom);
        scanner.close();
    }
}
