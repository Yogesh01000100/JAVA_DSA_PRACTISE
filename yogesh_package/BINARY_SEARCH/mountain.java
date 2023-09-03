package yogesh_package.BINARY_SEARCH;

public class mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,99,65,4,3,2};
        int[] arr1={1,2,1,3,5,6,4};
        System.out.println(func(arr));
    }

    private static int func(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
