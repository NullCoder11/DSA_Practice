//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.*;
class twoSum{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of elements you want: ");
int n = sc.nextInt();
System.out.println("Enter the elements: ");
int arr[] = new int[n];

//taking array input
for(int i = 0;i<n;i++){
arr[i] = sc.nextInt();
}
System.out.println("Enter the target: ");
int target = sc.nextInt();
int index[] = new int[n];
int k=0;
for(int i = 0;i<arr.length;i++){
for(int j = 0;j<=i;j++){
if(arr[i]+arr[j]==target){
index[k++] = j;
index[k++] = i;
}
}
}
for(int i=0;i<k;i++){
System.out.println(index[i]);
}
}
}
//This is a naive approach. Time complexity of this approach is O(n^2) and space complexity is O(1).