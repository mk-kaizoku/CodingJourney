class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())   return -1;
        return rabin_karp_helper(haystack,needle);
    }

    public int rabin_karp_helper(String a, String b){
        int n=a.length();
        int m=b.length();
        int d=256;
        int mod=101;
        int h=1;
        
        for(int i=0; i<m-1; i++){
            h=(h*d)%mod;
        }

        int ahash=0;
        int bhash=0;
        for(int i=0; i<m; i++){
            ahash=(d*ahash+a.charAt(i))%mod;
            bhash=(d*bhash+b.charAt(i))%mod;
        }

        for(int i=0; i<=n-m; i++){
            if(ahash==bhash){
                boolean check =true;
                for(int j=0; j<m; j++){
                    if(a.charAt(j+i)!=b.charAt(j)){
                        check=false;
                        break;
                    }
                }
                if(check==true)  return i;
            }
            if(i<n-m){
                ahash=(d*(ahash-a.charAt(i)*h)+a.charAt(i+m))%mod;
                if(ahash<0) ahash+=mod;
            }
        }
        return -1;
    }
}