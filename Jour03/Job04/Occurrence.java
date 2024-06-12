package Jour03.Job04;

public class Occurrence {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 9, 8};
        int[] occurrences = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            occurrences[number]++;
        }
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println("Number " + i + " occurs " + occurrences[i] + " time(s)");
            }
        }
    }
}
