import java.util.Scanner;

//Bài 6 Nhập vào ngày tháng năm rồi in ra ngày tiếp theo
//Ví dụ nhập vào ngày 25/12/2021 thì phải in ra ngày 26/12/2021
//Yêu cầu: Sử dụng hàm
//Gợi ý: Hãy sử dụng các hàm có sẵn hỗ trợ Split() để tách ngày, tháng, năm ra thành các giá trị. Sau đó ép kiểu để tính toán
//
//Lưu ý: Hãy chú ý tới trường hợp nếu nhập vào
//
//Ngày 30/7/2021 thì ngày tiếp theo sẽ phải là 01/08/2021
//Tương tự ngày 31/12/2021 thì ngày tiếp theo là 01/01/2022
public class String6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao ngay thang nam: ");
        String a = input.nextLine();

        String[] b = a.split("\\/");

        int dd = Integer.parseInt(b[0]) + 1;
        int mm = Integer.parseInt(b[1]);
        int yy = Integer.parseInt(b[2]);

        if (dd == 31) {
            if (mm == 12) {
                mm = 1;
                dd = 1;
                yy += 1;
                System.out.format("%d/%d/%d", dd, mm, yy);
            } else {
                dd = 1;
                mm += 1;
                System.out.format("%d/%d/%d", dd, mm, yy);
            }
        } else if (dd == 32) {
            if (mm == 12) {
                mm = 1;
                dd = 1;
                yy += 1;
                System.out.format("%d/%d/%d", dd, mm, yy);
            } else {
                dd = 1;
                mm += 1;
                System.out.format("%d/%d/%d", dd, mm, yy);
            }
        } else {
            System.out.format("%d/%d/%d", dd, mm, yy);
        }
    }
}
