package yogesh_package.SORTING;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 1, 3, 9, 5, 45, 35, 11, 900 };
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void func(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
             int max_index=max(arr, arr.length-index);
             int temp=arr[max_index];
             arr[max_index]=arr[arr.length-index-1];
             arr[arr.length-index-1]=temp;
        }
    }

    static int max(int[] arr, int indx) {
        int max=arr[0];
        int index=0;
        for (int i = 0; i < indx; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index=i;
            }
        }
        return index;
    }

}
