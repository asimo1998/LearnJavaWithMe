import java.util.Scanner;

public class arr5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập và độ dài của mảng: ");
        int n = input.nextInt();

        int[] arr;
        arr = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Nhập vào giá trị của mảng arr" + "[" + i + "]: ");
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] % 3 == 0) {
                sum += arr[j];
            }
        }
        System.out.println("Tổng của dãy là: " + sum);
    }


}

