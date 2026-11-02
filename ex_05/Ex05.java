import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> result = new ArrayList<String>();

        for (String value : var) {
            result.add(value);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> words = myGetArgs("Hello", "Duke", "Java");

        System.out.println(words);
    }
}
