import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Nhap vao so n: ");
            n = input.nextInt();
            System.out.println(n);
        }
        while (n % 3 == 0);
    }
}
