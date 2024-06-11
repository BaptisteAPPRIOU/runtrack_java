package Jour02.Job09;

public class Chiffre {
    public static void main(String[] args) {
        String chiffre = "1234";
        for (int i = 0; i < chiffre.length(); i++) {
            if (i == 0) {
                System.out.println("Le premier chiffre de 1234 est : " + chiffre.charAt(i));
            } else if (i == chiffre.length() - 1) {
                System.out.println("Le dernier chiffre de 1234 est : " + chiffre.charAt(i));
            }
        }
    }
}
