import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        while (true) {
            year++; // increment first, then check

            int test = year;
            int n1 = test % 10; test /= 10;
            int n2 = test % 10; test /= 10;
            int n3 = test % 10; test /= 10;
            int n4 = test % 10;

            if (n1 != n2 && n1 != n3 && n1 != n4
             && n2 != n3 && n2 != n4
             && n3 != n4) {
                break;
            }
        }

        System.out.print(year);
    }
}