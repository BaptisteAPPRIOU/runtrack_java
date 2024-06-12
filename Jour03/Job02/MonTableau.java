package Jour03.Job02;

public class MonTableau {
    public static void main(String[] args) {
        int[] monTableau = {12,6,76,89};
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = monTableau[i] * 2;
        }
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
    }
}
