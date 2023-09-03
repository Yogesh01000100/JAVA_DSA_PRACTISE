package yogesh_package.BINARY_SEARCH;

public class ceil {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 24, 36, 45, 98, 102 };
        System.out.println(func(arr,98));
    }

    private static int func(int[] arr, int target) {


        if(target>=arr[arr.length-1])
        {
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=(start+end)/2;

            if(target==arr[mid])
            {
                return arr[mid];// here we dont put mid plus 1, as >= to target 
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
