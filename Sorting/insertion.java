import java.util.Arrays;
class sorting{
public static void main(String[]args){
int[]nums = {4,5,1,2,8,7};
insertion(nums);
System.out.println(Arrays.toString(nums));
}
static void insertion(int[]nums){
for(int i = 0;i<nums.length-1;i++){
for(int j = i+1;j>0;j--){
if(nums[j]<nums[j-1]){
  //swapping
int temp = nums[j];
nums[j]=nums[j-1];
nums[j-1]=temp;

}else{
  
break;
}
}
}
}
}
