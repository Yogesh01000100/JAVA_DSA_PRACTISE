package yogesh_package.BINARY_SEARCH;

public class rotate_count {
    public static void main(String[] args) {
        int[] arr = { 15, 19, 2, 3, 6, 12 };
        System.out.println((func(arr) % arr.length) + 1);
    }

    private static int func(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
