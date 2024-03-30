// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/rotation-of-matrix?page=0&pageSize=50
import java.io.*;
import java.util.*;

public class rotation_of_matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int x=1;
        while(t-->0){
            int n=sc.nextInt();
            int[][] mat=new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    mat[i][j]=sc.nextInt();
                }
            }
            System.out.println("Test Case #"+x+":");
            rotatematrix(mat,n);
            x++;
        }
    }
    public static void rotatematrix(int[][] mat, int n){
        // First, transpose the matrix
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        // Then, reverse each row of the transposed matrix to get the final rotated matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }

        //Print the rotated matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}