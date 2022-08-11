import java.util.Locale;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao chuoi: ");
        String a = input.nextLine();
        String[] b = a.split("\\s");
        String sum = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i].length() > 0) {
                String c = b[i].substring(0, 1).toUpperCase();

                String d = b[i].substring(1, b[i].length()).toLowerCase();

                String newstring = c + d;

                newstring += " ";

                sum += newstring;
            }
        }
        System.out.println();
        System.out.format("Chuoi moi la: %s",sum);
    }
}
