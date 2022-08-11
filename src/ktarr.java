import java.util.Scanner;

public class ktarr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao so phan tu cua mang A: ");
        int a = input.nextInt();
        int[] arr;
        arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Nhap vao gia tri cua phan tu thu " + (i + 1) + "" +
                    ": ");
            arr[i] = input.nextInt();

        }

        System.out.print("Nhap vao so phan tu cua mang B: ");
        int b = input.nextInt();
        int[] brr;
        brr = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.print("Nhap vao gia tri cua phan tu thu " + (i + 1) + "" +
                    ": ");
            brr[i] = input.nextInt();
            if (brr[i] < 0) {

            }

        }

        int m = a + b;
        int[] arr1 = new int[m]; // khoi tao mang tam cho mang A
        int[] brr1 = new int[m]; // khoi tao mang tam cho mang B

        //Dua het so am cua 2 mang sang A va dua het so duong cua hai mang sang B

        int dem1 = 0;
        int dem2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr1[dem1] = arr[i];
                dem1++;
            } else {
                brr1[dem2] = arr[i];
                dem2++;
            }
        }
        System.out.println(dem1);
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] < 0) {
                arr1[dem1] = brr[i];
                dem1++;
            } else {
                brr1[dem2] = brr[i];
                dem2++;
            }
        }

        System.out.println("Mang B moi la: ");
        for (int i = 0; i < dem2; i++) {
            System.out.print(brr1[i] + " ");
        }
        System.out.println();
        System.out.println("Mang A moi la: ");
        for (int i = 0; i < dem1; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
