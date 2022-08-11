public class arr6 {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12,17,18};

        int j = arr.length;

        for(int i = 0; i < arr.length; i ++) {
            int swap = arr[i];
            arr[i] = arr[j - 1];
            arr[j - 1] = swap;
            j--;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
