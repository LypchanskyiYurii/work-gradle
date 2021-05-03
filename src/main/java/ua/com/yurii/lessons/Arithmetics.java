package ua.com.yurii.lessons;

public class Arithmetics {

    public int sumUpTo(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

}
