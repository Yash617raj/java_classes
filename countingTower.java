import java.util.*;

public class countingTower {

    static HashMap<Long,Totalways> dp = new HashMap<>();
    static long mod = 1000000007L;

    static class Totalways{ // This stores the total number of ways we can consturct tower of length n 
        long width1; // this stores block of 1,1 
        long width2; // this stores block of length 2

        Totalways(long width1, long width2){
            this.width1 = width1;
            this.width2 = width2;
        }
        @Override
        public String toString(){
            return width1 +" "+ width2;
        }
    }

    static Totalways solve(long n){
        if(n==1) return new Totalways(1, 1);

        // memoize
        if(dp.containsKey(n)){
            return dp.get(n);
        }

        var prev = solve(n-1); // ways to solve n-1 height
        var withWidth1 = (prev.width1*4 + prev.width2) % mod;
        var withWidth2 = (prev.width1 + prev.width2*2) % mod;


        var res =  new Totalways(withWidth1, withWidth2);
        dp.put(n,res);
        return res;
    }


    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        // long t = sc.nextLong();
        long n = 2;
        // while(t>0){
            // long n = sc.nextLong();
            var res = solve(n);
            System.out.println((res.width1+res.width2)%mod);
            // t--;
        // }

        sc.close();
    }
}
