public class check_bit{
    public static boolean checkbit(long n, int k){
        return (((n>>k)&1)==1);
    }
}