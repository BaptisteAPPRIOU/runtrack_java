package Jour03.Job03;

public class Prenoms {
    public static void main(String[] args) {
        String[] prenoms = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(prenoms[1]);
        prenoms[2] = "Mireille";
        for (int i = 0; i < prenoms.length; i++) {
            System.out.println(prenoms[i]);
        }
    }
}
