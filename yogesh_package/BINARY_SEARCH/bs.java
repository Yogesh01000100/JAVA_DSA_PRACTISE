package yogesh_package.BINARY_SEARCH;

public class bs {
    public static void main(String[] args) {
        int[]arr={12,24,36,56,78,98};
        System.out.println(func(arr,98));
    }

    private static int func(int[] arr,int target) {

        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
