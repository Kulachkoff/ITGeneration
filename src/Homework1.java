import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in °C: ");

        int celsius = scanner.nextInt();
        double fahrenheit = (double) celsius * 9 / 5 + 32;

        System.out.printf("%d°C equals %.2f°F.", celsius, fahrenheit);
    }
}
