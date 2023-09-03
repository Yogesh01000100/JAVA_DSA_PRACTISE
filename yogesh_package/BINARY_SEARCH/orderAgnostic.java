package yogesh_package.BINARY_SEARCH;

public class orderAgnostic {
    public static void main(String[] args) {
       // int[] arr = { 12, 23, 24, 36, 45, 98, 102 };
        int[] arr2 = { 98, 65, 52, 32, 12, 5, 3, 1 };

        System.out.println(func(arr2, 65));
    }

    private static int func(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (arr[0] < arr[arr.length - 1]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        } else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
}
