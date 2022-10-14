//binary search 

public class BinarySearch{
    public static void main(String[]args){
        int arr[] = {0,4,56,89,200,480,1234};
        int target = 480;
        int ans = bise(arr,target);
        System.out.println(ans);
    }
    static int bise(int[]arr,int target){
        //taking two pointers
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            //finding the middle element
            int mid = start +(end-start)/2;
            
            if(target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
                
            }else
            return mid;
        }
            //if target is not in the list

        return -1;
    }

}