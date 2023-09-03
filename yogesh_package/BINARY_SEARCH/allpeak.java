package yogesh_package.BINARY_SEARCH;

import java.util.*;

public class allpeak {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 3, 1, 10, 1 };
        List<Integer> peaks = findPeaks(arr);
        System.out.println("Peak elements are at indices: " + peaks);
    }

    static List<Integer> findPeaks(int[] arr) {
        List<Integer> peakIndices = new ArrayList<>();

        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                    (mid == n - 1 || arr[mid] >= arr[mid + 1])) {
                peakIndices.add(mid); // Found a peak element
            }

            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                e = mid - 1; // Move to the left half
            } else {
                s = mid + 1; // Move to the right half
            }
        }

        return peakIndices;
    }
}
