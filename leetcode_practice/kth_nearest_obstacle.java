import java.util.*;
class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int n=queries.length;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        int[] ans=new int[n];   //result array 
        int idx=0;              // track index
        for(int i=0; i<n; i++){
            int distance=Math.abs(queries[i][0])+Math.abs(queries[i][1]);       // calculate distance (abs)
            q.add(distance);                // add distance to queue

            if(q.size()<k){                 // if q size < k    return -1 
                ans[idx]=-1;
                
            }else{
                if(q.size()>k){             // if q size> k remove peek element
                    q.remove();
                }
                ans[idx]=q.peek();          // after removing extra elements new peek is the answer
                
            }
            idx++;
        }
        return ans;
    }
}