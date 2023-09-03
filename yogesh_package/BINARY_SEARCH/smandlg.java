package yogesh_package.BINARY_SEARCH;

import java.util.ArrayList;

public class smandlg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] A = { -2, -1, 4, 5, 6, 7, -3 };
        int[] B={5,6,99,1,2,3,4};
        list = func(B);
        System.out.println(list);
    }

    static ArrayList<Integer> func(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length<=1 || arr[0]<arr[arr.length-1])
        {   list.add(arr[0]);
            list.add(arr[arr.length-1]);
            return list;
        }
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (arr[mid] > arr[mid + 1] ) {
                list.add(arr[mid+1]);
                list.add(arr[mid]);
                return list;
            }
            else if(arr[mid]<arr[mid+1] && arr[s] < arr[mid])
            {
                s=mid+1;
            } 
            else {
                e = mid;
            }
        }
        return list;
    }
}
