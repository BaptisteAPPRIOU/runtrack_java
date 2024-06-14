package Jour04.Job04;

import java.util.Scanner;

public class Compteur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number to count: ");
        int maxNumber = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 1; i <= maxNumber; i++) {
            count++;
            System.out.println(count);
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        System.out.println("Total count: " + count);
        System.out.println("Execution time: " + executionTime + " milliseconds");
        scanner.close();
    }
}
