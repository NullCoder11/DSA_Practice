//Cieling of a number
//An array is given. You need to find the cieling number of a given "Target"
//from the array.
//Cieling = smallest element in the array greater or equal to the target.

class Cieling{
public static void main(String []args){
int arr[] = {10,20,30,40,50,60,70};
int target = 52;
int ans = cielingNum(arr,target);
System.out.println(ans);
}
static int cielingNum(int arr[],int target){

int start = 0;
int end = arr.length-1;

//if target is greater than the greatest number in the array
if(target>arr[arr.length-1]){
return -1;
}
while(start<=end){
int mid = start +(end-start)/2;

if(target<arr[mid]){
end = mid-1;
}else if(target>arr[mid]){
start=mid+1;
}else
return mid;
}
return start;
}
}