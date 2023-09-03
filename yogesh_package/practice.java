package yogesh_package;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 123, 45, 78 };

        int[][] arr2={
            {1,66,5,6},
            {41,23,9,5,477},
            {56,89}
        };

        int tar=9;
        boolean resul=search_2d_array(arr2,tar);
        System.out.println(resul);

        String fname = "D.Yogesh";
        String name = "Yogesh";
        int k = linearSearch(arr, 63);
        System.out.print(k);
        System.out.println(Arrays.toString(arr));
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean m = find(name, 'p');
        System.out.println(m);

        printchar(fname);

        String str = "Hello, world!";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }

    }

    private static boolean search_2d_array(int[][] arr2, int tar) {


        for (int index = 0; index < arr2.length; index++) {
            
        }
        return false;

    }

    private static void printchar(String name) {

        char[] new_Arr = name.toCharArray();// important part to convert a string to array then we can iterate
        // also instead of creating the new array we can instead directly put inside a for loop like this:
        // directly for( .. ... .. i<name.toCharArray())
        //and System.out.println(name.toCharArray()[i]);
        
        for (int i = 0; i < new_Arr.length; i++) {
            System.out.println(new_Arr[i]);
        }

        //else

        for(int j=0;j<name.length();j++)
        {
            char new_char=name.charAt(j);// convert the char value at current iteration
            System.out.println(new_char);
        }
    }

    static int linearSearch(int[] arr, int target)// linear search function
    {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    static boolean find(String arr, char target) {
        for (char ch : arr.toCharArray()) {
            if (ch == target) {
                System.out.println("FOUND!");
                return true;
            }
        }
        return false;
    }
}