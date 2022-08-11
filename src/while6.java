import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao n: ");
        int n = input.nextInt();
        int i = 0;

        do {
            System.out.println(n);
            n--;
        } while (n >= i);
    }

}
