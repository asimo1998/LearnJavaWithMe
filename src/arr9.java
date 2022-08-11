import java.util.Scanner;

public class arr9 {
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
        System.out.println("Mảng vừa nhập là: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.print("Nhập vào vị trí cần xoá: ");
        int insert = input.nextInt();

        for (int z = (insert - 1); z < (arr.length - 1); z++) {
            arr[z] = arr[z + 1];
        }

        System.out.println("Mảng mới là: ");
        for (int g = 0; g < (arr.length - 1); g++) {
            System.out.print(arr[g] + " ");
        }
    }
}
