import java.util.Scanner;

public class arr3 {
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
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
        }
        float tbc = (float) sum / n;
        System.out.println("Tổng của dãy là: " + sum);
        System.out.println("TBC của dãy là: " + tbc);
    }
}
