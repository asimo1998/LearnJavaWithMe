import java.util.Scanner;

public class while5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao a: ");
        int a = input.nextInt();

        System.out.println("Nhap vao b: ");
        int b = input.nextInt();

        Swap(a, b);
        System.out.println(a + " " + b);
        do {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        } while (a <= b);
    }

    public static void Swap(int a, int b) {
        if (a > b) {
            int swap = b;
            b = a;
            a = swap;
        }
    }
}

// tham tri tham chieu