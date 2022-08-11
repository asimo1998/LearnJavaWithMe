import java.util.Scanner;

public class arr1and2 {
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
        System.out.println("Mảng được in ra: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
