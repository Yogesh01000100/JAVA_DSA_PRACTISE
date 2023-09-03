package yogesh_package.LINEAR_SEARCH;

import java.util.ArrayList;

public class max_wealth {
    public static void main(String[] args) {
        int[][] arr = {

                { 1, 4, 9 },
                { 2, 3 },
                { 1, 2, 3, 4 },
                { 5, 4 }
        };
        ArrayList<Integer> lister=func(arr);
        System.out.println(lister);
    }

    private static ArrayList<Integer> func(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            int sum = 0;
            for (int j = 0; j < arr[index].length; j++) {
                sum += arr[index][j];
            }
            list.add(sum);
        }
        return list;
    }
}
