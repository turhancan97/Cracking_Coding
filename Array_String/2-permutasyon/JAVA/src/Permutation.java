import java.util.Arrays;

public class Permutation {

    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "cab";

        if (permutation(s, t)) {
            System.out.println("The strings are permutations of each other.");
        } else {
            System.out.println("The strings are not permutations of each other.");
        }
    }
}
