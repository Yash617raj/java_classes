import java.util.*;

public class class4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                long diff = arr[i - 1] - arr[i];
                sum += diff;
                arr[i] += diff;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
