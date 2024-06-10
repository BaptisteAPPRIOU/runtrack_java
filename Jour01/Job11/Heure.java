package Jour01.Job11;

public class Heure {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Entrez le nombre de minutes : ");
        int minutes = scanner.nextInt();
        int heures = minutes / 60;
        int minutesRestantes = minutes % 60;
        System.out.println("Heure convertie : " + heures + ":" + minutesRestantes);
        scanner.close();
    }
}
