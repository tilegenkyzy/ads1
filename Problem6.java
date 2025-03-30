import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(power(a, n));
    }

    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}