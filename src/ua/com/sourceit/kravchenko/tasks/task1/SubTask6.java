package ua.com.sourceit.kravchenko.tasks.task1;

public class SubTask6 {
    public static int getColumnNumber(String columnNotation){
        int columnNumber = 0;
        for(int i = 0; i < columnNotation.length(); i++) {
            columnNumber *= 26;
            columnNumber += columnNotation.toUpperCase().charAt(i) - 'A' + 1;
        }
        return columnNumber;
    }

    public static String getColumnNotation(int columnNumber){
        StringBuilder sb = new StringBuilder();
        while (columnNumber-- > 0) {
            sb.append((char)('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static int getNext(String columnNotation){
        return getColumnNumber(columnNotation) + 1;
    }
}
