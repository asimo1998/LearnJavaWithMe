import java.util.Scanner;

//Bài 4. Nhập vào một chuỗi bất kỳ, đếm số từ trong chuỗi
public class String4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao chuoi cua ban: ");
        String a = input.nextLine();
        a = "   ";
        String[] b = a.split("\\s");
        System.out.println(b.length);
        int sum = 0;

        System.out.println(" ".length());
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() > 0) {
                sum += b[i].length();
            }
        }
        System.out.println("So ki tu cua chuoi la: " + sum);
    }
}
