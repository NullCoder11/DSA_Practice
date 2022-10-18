//Floor of a number
//An array is given. You need to find the floor number of a given "Target"
//from the array.
//Floor = greatest element in the array smaller or equal to the target.

class floor{
public static void main(String []args){
int arr[] = {10,20,30,40,50,60,70};
int target = 52;
int ans = floorNum(arr,target);
System.out.println(ans);
}
static int floorNum(int arr[],int target){

int start = 0;
int end = arr.length-1;


while(start<=end){
int mid = start +(end-start)/2;

if(target<arr[mid]){
end = mid-1;
}else if(target>arr[mid]){
start=mid+1;
}else
return mid;
}
return end;
}
}