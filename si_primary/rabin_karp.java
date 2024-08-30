import java.util.*;

public class rabin_karp {
    private static final int d= 26;
    private static final long mod= 1000000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String[]  input=   sc.nextLine().split(" ");
            String p= input[0];
            String s=input[1];
            System.out.println(rabin_karp_helper(p,s));
        }
        sc.close();
    }
    
    public static int rabin_karp_helper(String p, String s){
        int plen=p.length();
        int slen=s.length();

        long p_hash=0;
        long s_hash=0;
        long w=1;
        int result=0;

        for(int i=0; i<plen-1; i++){
            w=(w*d)%mod;
        }

        for(int i=0; i<plen; i++){
            p_hash=(d*p_hash + (p.charAt(i)-'a'))%mod;
            s_hash=(d*s_hash+ (s.charAt(i)-'a'))%mod;
        }

        for(int i=0; i<=slen-plen; i++){
            if(p_hash==s_hash){
                int j;
                for(j=0; j<plen; j++){
                    if(s.charAt(i+j)!=p.charAt(j))  break;
                }
                if(j==plen) result++;
            }
            if(i<slen-plen){
                s_hash=(d*(s_hash-(s.charAt(i)-'a')*w)+(s.charAt(i+plen)-'a'))%mod;
                if(s_hash<0){
                    s_hash=s_hash+mod;
                }
            }
        }
        return result;
    }
    
}
