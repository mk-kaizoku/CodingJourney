import java.util.Scanner;

public class cardgame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int result = 0;

            int check = 0;
            if (a1 > b1) check++;
            if (a2 > b2) check++;
            if (check > 1) result++;

            check = 0;
            if (a1 > b2) check++;
            if (a2 > b1) check++;
            if (check > 1) result++;

            check = 0;
            if (a2 > b1) check++;
            if (a1 > b2) check++;
            if (check > 1) result++;

            check = 0;
            if (a2 > b2) check++;
            if (a1 > b1) check++;
            if (check > 1) result++;

            System.out.println(result);
        }
    }
}
