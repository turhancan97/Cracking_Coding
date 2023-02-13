import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    String compressedString = compressBad(str);
    System.out.println("Compressed String: " + compressedString);
}

static String compressBad(String str) {
    String compressedString = "";
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
        countConsecutive += 1;
        if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
            compressedString += "" + str.charAt(i) + countConsecutive;
            countConsecutive = 0;
        }
    }
    return compressedString.length() < str.length() ? compressedString : str;
}

}