import java.util.*;

public class Main {
    public static void main(String[] args) {
         // Checking out number of bytes

//        byte a=0,b=0;
//        do{
//            System.out.println(a++);
//        }
//        while (a!=b);

        // For finding out ascii value

//        char ch =0;
//        for(; ch<=Short.MAX_VALUE;ch++){
//            System.out.println((int)ch+" = "+ch);
//        }

        // How to take input

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.printf("The input string is %s\n",s);

//        var sc = new Scanner(System.in); // instead of writing Scanner on the left side we can use var now in the latest version
//        int x = sc.nextInt();
//        var arr = new int[x];
//        arr[0] = 1;
//        System.out.println(arr[4]);
//        System.out.println(arr.length);

        // iterative fibonacci

//        var sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a=0,b=1;
//        System.out.print(a+" "+b+" ");
//        for(int i=2;i<n;i++){
//            int t = a+b;
//            System.out.print(t+" ");
//            a = b;
//            b=t;
//        }

        // recursive fibonnacci

//        static int fibo (int count){
//            if(count==0 || count==1) return count;
//            return fibo(count-1)+fibo(count-2);
//        }
//        var sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(fibo(n));

        // sieve of Eratosthenes

        // Upper limit for the primes we want to check for.
        int maxVal = 29;

        // create a static sized (31) length arraylist of boolean with default value of true.
        // We dont need to initialize the values if we use arraylist.
        var isPrime = new ArrayList<Boolean>(Collections.nCopies(maxVal+1, true));

        // c++ equivalent.
        // auto x = vector<bool>(maxVal+1, true);

        for (int num = 2; num <= maxVal; num++) {
            if (!isPrime.get(num)) continue;
            for (int multiple = num*2; multiple <= maxVal; multiple += num) {
                isPrime.set(multiple, false);
            }
        }

        // Printing primes
        for (int num = 2; num <= maxVal; num++) {
            if (isPrime.get(num)) System.out.println(num);
        }

    }
}
// The name used for an ip address is known as domain