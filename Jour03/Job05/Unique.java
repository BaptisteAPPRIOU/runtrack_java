package Jour03.Job05;

public class Unique {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 7, 3, 0, 4, 8, 6, 2, 3, 5, 9, 8, 6};
        int[] occurrences = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            occurrences[number]++;
        }
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] == 1) {
                System.out.println("Number " + i + " is unique");
            }
        }
    }
}
