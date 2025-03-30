import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        System.out.println(isAllDigits(s) ? "Yes" : "No");
    }

    public static boolean isAllDigits(String s) {
        return s.matches("\\d+");
    }
}