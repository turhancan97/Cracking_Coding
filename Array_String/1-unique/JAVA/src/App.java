import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isUniqueChars(inputString)) {
            System.out.println("All characters in the string are unique.");
        } else {
            System.out.println("There are duplicate characters in the string.");
        }
    }
    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (char_set[val]) return false; // already found this character in the string

            char_set[val] = true;
        }
        return true;
    }
}
