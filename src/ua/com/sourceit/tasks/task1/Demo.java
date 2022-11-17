package ua.com.sourceit.tasks.task1;

public class Demo {
    public static void main(String[] args) {
        //SubTask1
        System.out.println(SubTask1.sumOfTwo(5, 6));
        //SubTask2
        System.out.println(SubTask2.concatStrings("String1", "String2"));
        //SubTask3
        System.out.println(SubTask3.greatestCommonDivisor(45, 67));
        //SubTask4
        System.out.println(SubTask4.sumOfDigits(4518123));
        //SubTask5
        SubTask5.allPrimeNumbers();
        //SubTask6
        System.out.println(SubTask6.getColumnNumber("AZC"));
        System.out.println(SubTask6.getColumnNotation(1355));
        System.out.println(SubTask6.getNext("AZC"));
    }
}
