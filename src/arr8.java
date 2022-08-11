
import java.util.Scanner;

public class arr8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập và độ dài của mảng: ");
        int n = input.nextInt();
        int[] arr;
        arr = new int[n + 1];

        int i;
        for (i = 0; i < n; i++) {
            System.out.print("Nhập vào giá trị của mảng arr" + "[" + i + "]: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.print("Nhập vào vị trí cần chèn: ");
        int insert = input.nextInt();
        System.out.print("Nhập vào giá trị cần chèn: ");
        int values = input.nextInt();

        for (int z = (arr.length - 1); z > (insert - 1); z--) {
            arr[z] = arr[z - 1];
            arr[insert - 1] = values;
        }

        System.out.println("Mảng mới là: ");
        for (int g = 0; g < (n + 1); g++) {
            System.out.print(arr[g] + " ");
        }
    }
}
