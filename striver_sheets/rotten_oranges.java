//{ Driver Code Starts
import java.util.*;
import java.io.*;
class rotten_oranges
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Pair {
  int row;
  int col;
  int tm;
  Pair(int _row, int _col, int _tm) {
    this.row = _row;
    this.col = _col;
    this.tm = _tm;
  }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        
        int[][] vis= new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        int cntFresh=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // set initial rot oranges as 2 in visited and add them to q with time 0
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    cntFresh++;
                }
            }
        }
        int tm=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int cnt=0; // track how many fresh got rot
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(t, tm);
            q.remove();
            for(int i=0; i<4; i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<n && ncol >=0 && ncol<m && vis[nrow][ncol]!=2 && grid[nrow][ncol]==1){
                    vis[nrow][ncol]=2;
                    q.add(new Pair(nrow, ncol, t+1));
                    cnt++;
                }
            }
        }
        if(cnt!=cntFresh)   return -1;
        return tm;
    }
}