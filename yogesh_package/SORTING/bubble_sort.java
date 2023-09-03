package yogesh_package.SORTING;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 3, 9, 5, 45, 35, 11, 900 };
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void func(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
