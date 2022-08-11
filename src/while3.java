import java.util.Scanner;

/*Bài 3. Nhập vào số n từ bàn phím, in ra màn hình trung bình cộng của các số trong khoảng từ 1 tới n.*/
public class while3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao gia tri cua n: ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);
        float TBC = (float) sum / n;
        System.out.print("TBC cua day la: " + TBC);
    }
}
