import java.util.Scanner;

public class App_v2 {
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
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';

            if ((checker & (1 << val))>0) return false; // already found this character in the string

            checker |= (1<<val);
        }
        return true;
    }
}
