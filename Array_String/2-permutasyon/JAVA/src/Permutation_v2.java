public class Permutation_v2 {

    public static boolean checkPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[128]; // Assuming: ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true; // letters has no neg values, and therefore no pos values either
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "cab";

        if (checkPermutation(s, t)) {
            System.out.println("The strings are permutations of each other.");
        } else {
            System.out.println("The strings are not permutations of each other.");
        }
    }
}