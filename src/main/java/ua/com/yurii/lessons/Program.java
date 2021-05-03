package ua.com.yurii.lessons;

public class Program {

    public static void main(String[] args) {
        Arithmetics arithmetics = new Arithmetics();
        int sum = arithmetics.sumUpTo(5);
        System.out.println("Sum of all numbers from 0 to 5 = " + sum);
    }

}
