package Jour04.Job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Generator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();
        scanner.close();
        long startTime = System.currentTimeMillis();

        // Create two threads
        Thread firstHalfThread = new Thread(() -> {
            String firstHalf = generateRandomString(length / 2);
            writeToFile("Jour04/Job03/output.txt", firstHalf);
        });

        Thread secondHalfThread = new Thread(() -> {
            String secondHalf = generateRandomString(length - (length / 2));
            writeToFile("Jour04/Job03/output.txt", secondHalf);
        });

        // Start the threads
        firstHalfThread.start();
        secondHalfThread.start();

        // Wait for both threads to finish
        try {
            firstHalfThread.join();
            secondHalfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " milliseconds");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    private static void writeToFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
