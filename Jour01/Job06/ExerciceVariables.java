package Jour01.Job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}
