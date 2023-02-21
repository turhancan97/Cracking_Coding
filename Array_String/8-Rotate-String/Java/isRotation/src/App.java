public class App {
    static boolean isSubstring(String str1, String str2) {
        return str1.contains(str2);
    }

    static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        /* Check that s1 and s2 are equal length and not empty */
        if (len == s2.length() && len > 0) {
            /* Concatenate s1 and s1 within new buffer */
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        boolean result = isRotation(s1, s2);

        System.out.println(result);
    }
}
