import java.util.*;
public class class3{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s= sc.nextLine();
        int count=0,maxi=0;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                maxi = Math.max(maxi,count);
            }
            else count = 0;
        }
        System.out.println(maxi+1);
        sc.close();
    }
}
