import java.util.Scanner;

/*Bài 7. Nhập vào 2 số a, b. In ra màn hình ma trận tọa độ của a x b. Gợi ý: Dùng 2 vòng lặp for lồng nhau (cái này gọi là for lồng)
Ví dụ: a = 3, b =4 thì in ra màn hình:
11 12 13 14
21 22 23 24
31 32 33 34*/
public class while7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao so a: ");
        int a = input.nextInt();

        System.out.print("Nhap vao so b: ");
        int b = input.nextInt();

        Matrixx(a, b, 0);
    }
    public static  void Matrixx(int a, int b, int k){
        while (k < a) {
            int i = 0;
            while (i < b) {
                System.out.print(k + "" + i + " ");
                i++;
            }
            System.out.println();
            k++;
        }
    }
}
