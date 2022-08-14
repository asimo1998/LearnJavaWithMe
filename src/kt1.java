import java.util.Scanner;

//Bài 1.
//Nhập vào một mảng gồm n phần tử (0 < n < 100)
//Yêu cầu:
//
//Nếu nhập vào n không thỏa mãn điều kiện thì yêu cầu người dùng nhập lại
//Hãy viết hàm kiểm tra tính đối xứng của mảng.
//Ví dụ: Mảng như sau được gọi là mảng đối xứng: [1,2,3,3,2,1], [1,2,3,2,1]
public class kt1 {
    public static void checkarr(int[] a, int n) {
        int check = 1;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                check = 0;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Mang a khong la mang doi xung");
        } else {
            System.out.println("Mang a la mang doi xung");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao gia tri cua n: ");
        int n = input.nextInt();
        if (n > 0 && n < 100) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = input.nextInt();
            }
            checkarr(a, n);
        } else {
            System.out.println("Moi ban nhap lai");
        }
    }
}
