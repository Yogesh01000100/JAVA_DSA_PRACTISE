package yogesh_package.coding_exam;
public class ladder {
    public static void main(String[] args) { 
        
        int[] arr={4,5,1,3,2};
        System.out.println(func(arr));
    }
    static int func(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int current_element=arr[i];
            boolean status=false;
            for(int j=i;j<arr.length && j+1<arr.length;j++)
            {
                if(current_element>arr[j+1])
                {
                    status=true;
                }
                else{
                    status=false;
                    break;
                }
            }
            if(status==true)
            {
                count++;
            }
        }
        return count;
    }
}
