import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        do {
            System.out.println("Nhap vao x: ");
            x = input.nextInt();
        } while (x < 1 || x > 100);
    }
}
