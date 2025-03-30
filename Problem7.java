import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            generatePermutations(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
        }
    }
}