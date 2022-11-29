package ua.com.sourceit.kravchenko.tasks.task1;

public class SubTask3 {
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return greatestCommonDivisor(b, a % b);
    }
}
