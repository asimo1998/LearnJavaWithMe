/*Bài 4. Nhập vào số n từ bàn phím, in ra màn hình trung bình cộng của các số chẵn nằm trong khoảng từ 1 tới n.
Ví dụ: n = 6, trung bình cộng = (2+4+6)/3 = 12/3 = 4*/

import java.util.Scanner;

public class while4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao gia tri cua n: ");
        int n = input.nextInt();

        int i = 1;
        int sum = 0;
        int dem = 0;
        do {
            i ++;
            if (i % 2 == 0) {
                dem++;
                sum += i;
            }
        } while (i <= n);
        float tbc = (float) sum / dem;
        System.out.print("TBC cua day la: " + tbc);
    }
}

