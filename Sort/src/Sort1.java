public class Sort1 {
        public static void main(String[] args) {
            int[] arr = new int[]{3090, 3233, 3412, 3300, 3000, 3989,9889, 4939, 3456};
            for (int i = 0; i < arr.length - 1; i++) {
                int minElementIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[minElementIndex] > arr[j]){
                        minElementIndex = j;
                    }
                }

                if(minElementIndex != i){
                    int temp = arr[i];
                    arr[i] = arr[minElementIndex];
                    arr[minElementIndex] = temp;
                }
            }
        }
    }

