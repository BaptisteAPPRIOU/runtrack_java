package Jour03.Job06;

public class Random {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        for (int number : numbers) {        // New print tech :)
            System.out.println(number);
        }
    }
}
