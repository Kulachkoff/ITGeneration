package ua.com.sourceit.kravchenko.tasks.task1;

import java.util.Scanner;

public class SubTask5 {
    public static void allPrimeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();

        for (int i = 1; i <= target; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int a) {
        if (a == 1 || a == 2) return true;
        if (a % 2 == 0) return false;
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
