import java.util.*;
public class class1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();

        while(n>1){
            System.out.print(n + " ");
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*n + 1;
            }
        }
        System.out.print(1);
        sc.close();
    }
}