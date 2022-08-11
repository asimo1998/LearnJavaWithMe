import java.util.Scanner;

/*Bài 2. Nhập vào số n từ bàn phím. In ra tổng số trong khoảng từ 0 đến n. Ví dụ: n = 4, tổng sẽ là: 1 + 2 + 3 + 4 = 10.
 */
public class while2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao gia tri cua n: ");
        int n = input.nextInt();

        int i = 0;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.print("tong cua day la: " + sum);
    }
}
