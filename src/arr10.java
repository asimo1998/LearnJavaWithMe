import java.util.Scanner;

public class arr10 {
    public static void hello(int a) {
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && i < a) {
                break;
            } else {
                System.out.println(a + " là số nguyên tố");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập và độ dài của mảng: ");
        int n = input.nextInt();

        int[] arr;
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào giá trị thu " + (i + 1) + " : ");
            arr[i] = input.nextInt();

            hello(arr[i]);
        }


    }
}
