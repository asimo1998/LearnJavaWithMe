//Bài 5. Nhập vào 2 chuỗi từ bàn phím (gọi là chuỗi A và chuỗi B).
//Hãy kiểm tra chuỗi B có xuất hiện trong chuỗi A hay không? Xuất hiện bao nhiêu lần và in ra vị trí bắt đầu xuất hiện của nó.
//Ví dụ:
//
//Chuỗi A: Hello boy, this is the boy hello you
//Chuỗi B: boy
//=> In ra màn hình "Chuỗi B xuất hiện 2 lần trong chuỗi A", các vị trí xuất hiện lần lượt là: "6, 23"

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao chuoi A: ");
        String a = input.nextLine();

        System.out.println("Nhap vao chuoi B: ");
        String b = input.nextLine();

//        Pattern c = Pattern.compile(b);
//        Matcher d = c.matcher(a);
//
//        int i = 0;
//        while (d.find()) {
//            i++;
//        }
//        System.out.println("So lan xuat hien cua chuoi B trong A la; " + i);

        int m = 0;
        for (int j = 0; (j = a.indexOf(b, j)) != -1; j++) {
            System.out.println("Chuoi B xuat hien tai vi tri thu:  " + j);
            m++;
        }
        System.out.println("So lan xuat hien cua chuoi B la: " + m);
    }
}
