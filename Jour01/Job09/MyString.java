package Jour01.Job09;

public class MyString {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "World";
        String str3 = String.valueOf(123);
        String str4 = String.format("%.2f", 3.14);
        System.out.println("str1" + " = " + str1 + ", str2 = " + str2 + ", str3 = " + str3 + ", str4 = " + str4);
    }
}
