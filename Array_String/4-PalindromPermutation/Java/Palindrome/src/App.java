import java.util.Scanner;

public class App {
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
    int[] table = buildCharFrequencyTable(phrase);
    return checkMaxOneOdd(table);
    }

    static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for (int count : table) {
        if (count % 2 == 1) {
            if (foundOdd) {
                return false;
            }
            foundOdd = true;
        }
    }
    return true;
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

    static int[] buildCharFrequencyTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    for (char c : phrase.toLowerCase().toCharArray()) {
        int x = getCharNumber(c);
        if (x != -1) {
            table[x]++;
        }
    }
    return table;
    }
}