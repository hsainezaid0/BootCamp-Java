import java.util.ArrayList;

public class Ex03 {
    public static void printArray(ArrayList<String> myArray) {
        for (String value : myArray) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        printArray(cars);
    }
}