import java.util.Scanner;

public class while8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao do cao cua tam giac: ");
        int n = input.nextInt();
        int k = 0;

        for (int i = 1; i <= n; i++, k = 0) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }
    }
}


