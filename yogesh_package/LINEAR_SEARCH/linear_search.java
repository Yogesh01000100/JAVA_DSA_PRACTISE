package yogesh_package.LINEAR_SEARCH;

public class linear_search {
    public static void main(String[] args)
    {
        int[] arr={45,56,78,12,3,5,6};
        /*int result=l_search(arr,12);
        System.out.println(result);*/

        int min_val=find_min(arr);
        int max_val=find_max(arr);
        System.out.print("Min value: "+min_val+"Max value: "+max_val);
    }

    static int find_min(int[] arr) {

        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    static int find_max(int[] arr) {

        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    static int l_search(int[] arr, int target) {
        for (int iterable_element : arr) {
            if(target==iterable_element)
            {
                return target;
            }
        }
        return -1;
    }
}
