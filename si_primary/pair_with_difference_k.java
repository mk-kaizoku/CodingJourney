import java.util.*;

public class pair_with_difference_k {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k =sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            String s="false";
            int target;
            for(int i=0; i<n; i++){
                if(k>0){
                    target=arr[i]+k;    //Important
                }
                else{
                    target=arr[i]-k;    // Important
                }
                if(checkdiffbs(arr,i+1,n-1,target))
                    s="true";   
            }
            System.out.println(s);  
            sc.close();          
        }
    }

    public static boolean checkdiffbs(int[] arr, int low, int high, int k){
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]>k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
    
}