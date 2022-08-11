//Bài 3. Cho 1 chuỗi bất kỳ có dạng như sau: "hello how are you #hello guys# im fine thank you"
//Hãy lấy ra chuỗi nằm trong cặp ##. Cụ thể trong trường hợp trên là chuỗi "hello guys"

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao chuoi: ");
        String a = input.nextLine();

        String [] b = a.split("\\#");
        System.out.println(b[1]);
    }
}
