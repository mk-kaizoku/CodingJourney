import java.util.*;

public class diagonal_traversal_matrix {

    public static void main(String[] args) {
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] mat = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            diagonalsum(mat);
        }
        sc.close();
    }
    
    public static void diagonalsum(int[][] mat){
        int n=mat.length;
        // int n=mat[0].length;


        for(int i=0; i<n; i++){
            int row=i;
            int col=n-1;
            int sum=0;
            for(int j=0; j<=i; j++){
                sum+=mat[row][col];
                row--;
                col--;
            }
            System.out.print(sum+" ");
        }

        for(int i=1; i<n; i++){
            int row=n-1;
            int col=n-1-i;
            int sum=0;
            for(int j=0; j<n-i; j++){
                sum+=mat[row][col];
                row--;
                col--;

            }
            System.out.print(sum+" ");
        }
        System.out.println();




    }
}