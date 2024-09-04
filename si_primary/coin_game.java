import java.util.*;

public class coin_game {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            if(canEmpty_v2(a,b)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        
        sc.close();

    }
    // given constrains 0-->10^7 for a, b  
    public static boolean canEmpty(long a, long b){
        if(a==0 && b==0)    return true;
        if(a<0 || b<0)  return false;
        boolean oneway=canEmpty(a-1,b-2);
        boolean secondway=canEmpty(a-2, b-1);
        return oneway || secondway;
    }
    public static boolean canEmpty_v2(long a, long b){
        if((a+b)%3!=0)  return false;
        long min=Math.min(a,b);
        long max=Math.max(a,b);
        if(max>2*min)   return false;
        return true;
    }
}