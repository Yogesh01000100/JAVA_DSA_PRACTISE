package yogesh_package.BINARY_SEARCH;

public class rotated_bs {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,56,0,1,2};
        int res=func(arr);
        System.out.println(res);
        /*int target=25;
        boolean found=binary_sh(arr,0,res,target);
        if(!found)
        {
            System.out.println(binary_sh(arr, res, arr.length-1, target));
        }
        else{
            System.out.println(found);
        }*/
    }

    private static boolean binary_sh(int[] arr, int start,int end,int target) {

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target==arr[mid])
            {
                return true;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }

    private static int func(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(mid<end && arr[mid]>arr[mid+1])// idea is you will reach a 2 sized array at end, 
            //ultimately you will have only 2 comparsions either arr[0]< || > arr[1]
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]>arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
