import java.util.*;
public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextLong();
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextLong();
        }

        long ans = (n * (n+1)) / 2;
        System.out.println(ans - sum);
    }
}