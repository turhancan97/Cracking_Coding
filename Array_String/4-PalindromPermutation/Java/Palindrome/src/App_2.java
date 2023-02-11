import java.util.Scanner;

public class App_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String phrase = sc.nextLine();
        if (isPermutationOfPalindrome(phrase)) {
            System.out.println("The string is a permutation of a palindrome");
        } else {
            System.out.println("The string is not a permutation of a palindrome");
        }
    }

    static boolean isPermutationOfPalindrome(String phrase) {
        int countOdd = 0;
        int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            if (table[x] % 2 == 1) {
                countOdd++;
            }
            else {
                countOdd--;
            }
        }
    }
    return countOdd <= 1;
    }

    static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
        }


}
