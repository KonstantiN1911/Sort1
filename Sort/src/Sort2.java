public class Sort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2131, 1123, 3223, 3132, 2232, 2123};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
