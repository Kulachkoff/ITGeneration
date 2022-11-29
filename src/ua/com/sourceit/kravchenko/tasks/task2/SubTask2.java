package ua.com.sourceit.kravchenko.tasks.task2;

public class SubTask2 {
    public static int substrCount(String input, String needle, int offset, int length){
        return input.substring(offset, length + offset).split(needle, -1).length - 1;
    }
}
