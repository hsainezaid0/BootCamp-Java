public class Ex02 {
    public static String getAngryDog(int nbr) {
        String result = "";

        for (int i = 0; i < nbr; i++) {
            result = result + "woof";
        }

        return result + "\n";
    }

    public static void main(String[] args) {
        String result = getAngryDog(3);
        System.out.print(result);
    }
}