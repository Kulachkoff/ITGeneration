package ua.com.sourceit.tasks.task1;

public class SubTask4 {
    public static int sumOfDigits(int a) {
        if (a == 0) return 0;
        return sumOfDigits(a / 10) + a % 10;
    }
}
