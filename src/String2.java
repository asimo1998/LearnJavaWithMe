import java.sql.Savepoint;
import java.util.Scanner;

//Bài 2. Nhập vào 1 chuỗi ngày giờ có định dạng: dd/MM/yyyy HH:mm:ss
//
//Trong đó:
//
//dd là ngày
//MM là tháng
//yyyy là năm
//HH là giờ
//mm là phút
//ss là giây
//Hãy định dạng lại chuỗi ngày tháng năm này theo dạng:
//
//yyyy/MM/dd HH:mm
//MM/dd/yyyy
//Ví dụ: Nhập vào 24/12/2022 12:36:22 thì in ra:
//
//2022/12/24 12:36
//12/24/2022
public class String2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao chuoi: ");
        String a = input.nextLine();

        String[] b = a.split("\\/");
        String[] c = b[2].split("\\s");
        String[] d = c[1].split("\\:");

        System.out.format("%S/%S/%S %S:%S", c[0], b[1], b[0], d[0], d[1]);
        System.out.println();
        System.out.format("%S/%S/%S", b[1], b[0], c[0]);
    }
}
