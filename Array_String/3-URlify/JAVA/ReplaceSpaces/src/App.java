import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] str = sc.nextLine().toCharArray();
        System.out.print("Enter the true length of the string: ");
        int trueLength = sc.nextInt();
        replaceSpaces(str, trueLength);
        System.out.println(str);
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        if (newIndex + 1 < str.length) {
            str[newIndex + 1] = '\0';
        }
        for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
            if (str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            } else {
                str[newIndex] = str[oldIndex];
                newIndex--;
            }
        }
    }

    public static int countOfChar(char[] str, int start, int end, char target) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (str[i] == target) {
                count++;
            }
        }
        return count;
    }
}
