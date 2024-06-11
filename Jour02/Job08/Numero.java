package Jour02.Job08;

public class Numero {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        String numero = input.nextLine();
        int chiffres = 0;
        for (int i = 0; i < numero.length(); i++) {
            chiffres++;
        }
        System.out.println("Le nombre " + numero + " contient " + chiffres + " chiffres.");
        input.close();
    }
}
