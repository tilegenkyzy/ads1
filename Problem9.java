import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(compute(n, k));
    }

    public static int compute(int n, int k) {
        if (k == 0 || k == n) return 1;
        return compute(n - 1, k - 1) + compute(n - 1, k);
    }
}