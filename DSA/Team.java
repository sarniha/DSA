import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int solved = 0;
        for (int i = 0; i < n; i++) {
            int count = 0; // moved here, outside the inner loop
            for (int j = 0; j < 3; j++) {
                int num = sc.nextInt();
                if (num == 1)
                    count++;
            }
            if (count >= 2) solved++; // also fixed: >= 2, not > 2
        }
        System.out.print(solved);
    }
}