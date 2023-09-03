package yogesh_package.LINEAR_SEARCH;

import java.util.*;

public class even_number_ls {
    public static void main(String[] args) {
        int[] arr={45,5,407456,12345,3645,893};
        ArrayList<Integer> temp=func(arr);
        System.out.println(temp);
    }

    private static ArrayList<Integer> func(int[] arr) { // return type arraylist
        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            int n=arr[index];
            int count=0;
            while(n>0)
            {
                n=n/10;
                count++;
            }
            if(count%2==0)
            {
                list.add(arr[index]);
            }
        }
        return list;
    }
}
