public class arr4 {
    public static void main(String[] args) {
        //int[] arr = {7, 3, 8, 1, 29, 6, 2};
        int[] arr = {2,1,1,2,3,4};
        int max = arr[0];
        int min = arr[0];

        int index1 = 0;
        int index2 = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index1 = i;
            } else if (min > arr[i]) {
                min = arr[i];
                index2 = i;
            }
        }

        System.out.println("Số lớn nhất là: " + max + " Index là: " + index1);
        System.out.println("Số nhỏ nhất là: " + min + " Index là: " + index2);
        System.out.println("Test for git");
    }
}
