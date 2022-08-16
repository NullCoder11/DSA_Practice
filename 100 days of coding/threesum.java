/* Given an array, we need to find if there is a triplet in the array whose sum is equal to a given value. If such a triplet is present, we need to print it and return true. Else, return false.

This problem is also known as "3 Sum problem".

Example:

Input: arr = [3,4,12,6,2,9] , sum = 24
Output: 3 , 12 , 9
Explanation: The triplet(3,9,12) give us a sum of 24. */

import java.util.*;
class threesum{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of elements: ");
int n=sc.nextInt();
System.out.println("Enter the elements of the array: ");
int arr[]=new int[n];

//input of array elements
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("Enter the target: ");
int target = sc.nextInt();
for(int i=0;i<arr.length-2;i++){
for(int j=i+1;j<arr.length-1;j++){
for(int k=j+1;k<arr.length;k++){
if(arr[i]+arr[j]+arr[k]==target)
System.out.println(arr[i]+","+arr[j]+","+arr[k]);
}
}
}
}
}
/*The time complexity of this naive solution is O(n^3) since we are using 
three for loops.
The space complexity is O(n) since no extra space is used. */