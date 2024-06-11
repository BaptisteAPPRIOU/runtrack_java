package Jour02.Job06;

public class SommePairs {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("La somme des nombres pairs de 1 à 100 est: " + sum);
    }
}
