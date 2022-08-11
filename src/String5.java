//Bài 5. Nhập vào 2 chuỗi từ bàn phím (gọi là chuỗi A và chuỗi B).
//Hãy kiểm tra chuỗi B có xuất hiện trong chuỗi A hay không? Xuất hiện bao nhiêu lần và in ra vị trí bắt đầu xuất hiện của nó.
//Ví dụ:
//
//Chuỗi A: Hello boy, this is the boy hello you
//Chuỗi B: boy
//=> In ra màn hình "Chuỗi B xuất hiện 2 lần trong chuỗi A", các vị trí xuất hiện lần lượt là: "6, 23"

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao chuoi A: ");
        String a = input.nextLine();

        System.out.println("Nhap vao chuoi B: ");
        String b = input.nextLine();

        String[] c = a.split("\\s");

        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i].length() > 0){
                boolean d = c[i].contains(b);
                if (d == true){
                    sum ++;
                }
            }
        }
        System.out.format("Chuoi B xuat hien %d lan trong chuoi A ",sum);
    }
}
