package yogesh_package.BINARY_SEARCH;

public class infinte_array {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 9, 10, 56, 78, 89, 98, 102, 108, 109, 150, 160, 180 };
        int[] res = func(arr, 160, 0, 1);
        System.out.println(func1(res, arr, 160));
    }

    private static int func1(int[] res, int[] arr, int target) {

        int start = res[0];
        int end = res[1]; 
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    private static int[] func(int[] arr, int target, int start, int end) {
        int[] pos_arr = { -1, -1 };
        while (start <= end && end < arr.length) {
            if (target > arr[end]) {
                start = end + 1;
                end = 2 * (end + 1) + 1;
            } else {
                pos_arr[0] = start;
                pos_arr[1] = end;
                return pos_arr;
            }
        }
        pos_arr[0] = start;
        pos_arr[1] = arr.length-1;
        return pos_arr;
    }
}
interface Innerinfinte_array {
        
}