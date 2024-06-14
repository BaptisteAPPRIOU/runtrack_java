package Jour04.Job05;

import java.util.Scanner;

public class Compteur2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number to count: ");
        int maxNumber = scanner.nextInt();
        
        long startTime = System.currentTimeMillis();
                
        // Create two threads
        Thread thread1 = new Thread(new CountingTask(1, maxNumber / 2));
        Thread thread2 = new Thread(new CountingTask(maxNumber / 2 + 1, maxNumber));
        
        // Start the threads
        thread1.start();
        thread2.start();
        
        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Get the final count from the counting tasks
        int finalCount = CountingTask.getCount();
        
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        
        System.out.println("Total count: " + finalCount);
        System.out.println("Execution time: " + executionTime + " milliseconds");
        scanner.close();
    }
}

class CountingTask implements Runnable {
    private static int count = 0;
    private final int start;
    private final int end;
    
    public CountingTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            synchronized (CountingTask.class) {
                count++;
            }
        }
    }
    
    public static int getCount() {
        return count;
    }
}
