package yogesh_package.BINARY_SEARCH;

import java.util.ArrayList;

public class first_last {
    public static void main(String[] args) {
        ArrayList<Integer> lister=new ArrayList<>();
        int[] arr = { 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 10 };
        int res = func(arr, 6);
        lister.add(res);
        int res1 = func1(arr, 6);
        lister.add(res1);
        System.out.println(lister);
    }

    private static int func1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                start=mid+1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }


    private static int func(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
