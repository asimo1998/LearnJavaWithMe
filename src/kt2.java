import java.util.Scanner;

//Bài 2.
//Nhập vào một chuỗi là họ tên của một người (Viết không dấu).
//Yêu cầu:
//
//In ra email của người đó theo cú pháp:Tên + Chữ cái đầu của họ (Viết hoa) + Những chữ cái đầu của tên đệm (viết hoa) + @gmail.com
//Ví dụ:
//Nguyen Thi Bich Phuong => PhuongNTB@gmail.com
//Nguyen Van Quang => QuangNV@gmail.com
//Cho phép người dùng nhập vào liên tục tên của người dùng. Kết thúc chương trình khi người dùng nhập vào chuỗi "exit"
//Ví dụ:
//Khi chạy chương trình lên sẽ hiển thị dòng: "Mời bạn nhập vào tên:", sau đó người dùng sẽ nhập tên vào thì in ra email của họ.
//Sau đó tiếp tục hiển thị ra dòng "Mời bạn nhập vào tên" để người dùng tiếp tục nhập tên và hiển thị kết quả email.
//Chương trình sẽ kết thúc khi người dùng nhập vào chuỗi "exit"
//Lưu ý:
//
//Chuỗi đầu vào là một chuỗi đã được chuẩn hóa, có thể ở các dạng như sau:
//"nguyen van quang"
//"Nguyen Van Quang"
//"Nguyen van quang"
public class kt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names;
        do {
            System.out.print("Moi ban nhap ten cua minh: ");
            names = input.nextLine();

            int checkexit = names.compareTo("exit");

            if (checkexit == 0) {
                break;
            } else {

                String[] a = names.split("\\s");

                String subnames = "";
                int i = 0;
                do {
                    String firschar = a[i].substring(0, 1);
                    String upfirschar = firschar.toUpperCase();
                    subnames += upfirschar;
                    i++;
                } while (i <= a.length - 2);

                String firstnames = a[a.length - 1].substring(0, 1);
                String upfirstnames = firstnames.toUpperCase();
                String dowfirstnames = a[a.length - 1].substring(1).toLowerCase();
                String emails = upfirstnames + dowfirstnames + subnames + "@gmail.com";

                System.out.println("Dia chi email la: " + emails);
            }
        } while (names != "exit");

    }
}
