package ua.com.sourceit.kravchenko.tasks.task2;

public class SubTask1 {
    public static boolean testString(String string){
        return string.chars().filter(ch -> ch == '(').count() == string.chars().filter(ch -> ch == ')').count() &&
               string.chars().filter(ch -> ch == '[').count() == string.chars().filter(ch -> ch == ']').count() &&
               string.chars().filter(ch -> ch == '{').count() == string.chars().filter(ch -> ch == '}').count();
    }
}
