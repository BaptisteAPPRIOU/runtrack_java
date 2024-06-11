package Jour02.Job10;

public class Chiffre2 {
    public static void main(String[] args) {
        String chiffre = "1234";
        int somme = 0;
        for (int i = 0; i < chiffre.length(); i++) {
            somme += Integer.parseInt(String.valueOf(chiffre.charAt(i)));
        }
        System.out.println("La somme des chiffres de " + chiffre + " est " + somme);
    }
}
