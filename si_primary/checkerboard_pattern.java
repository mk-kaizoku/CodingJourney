import java.util.Scanner;

public class checkerboard_pattern {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            
            System.out.println("Case #" + t + ":");
            printCheckerboard(N);
        }
        
        scanner.close();
    }
    
    public static void printCheckerboard(int N) {
        for (int i = 0; i < 2 * N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                if ((i / 2 + j / 2) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

