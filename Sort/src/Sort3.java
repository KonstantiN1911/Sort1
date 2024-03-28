import java.util.Arrays;

public class Sort3 {
    public static void main(String[] args) {
        int[] arr = new int[]{123, 32, 133, 3213, 3321, 123131};
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }
}
