public class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            return;
        }

        String current = "1";

        for (int iteration = 0; iteration <= nbr; iteration++) {
            System.out.println(current);

            if (iteration == nbr) {
                break;
            }

            String next = "";
            int position = 0;

            while (position < current.length()) {
                char digit = current.charAt(position);
                int count = 0;

                while (position < current.length()
                        && current.charAt(position) == digit) {
                    count++;
                    position++;
                }

                next = next + count + digit;
            }

            current = next;
        }
    }

    public static void main(String[] args) {
        sequence(5);
    }
}