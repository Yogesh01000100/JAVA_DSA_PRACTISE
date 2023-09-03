package yogesh_package.SORTING;

public class missing_kth_index {
    public static void main(String[] args) {
        int k = 6;
        int[] arr = { 2, 4, 6, 7, 10 };// { 2,[3],4,[5],6,7,[8,9],10 }
        System.out.println(func(arr, k));
    }

    static int func(int[] arr, int k) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i + 1] - arr[i] != 1) {
                for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                    counter++;
                    if (counter == k) {
                        return j;
                    }
                }
            }
        }
        if(k>counter)
        {
            int leng=arr.length-1;
            return arr[leng]+(k-counter);
        }
        return -1;
    }
}
