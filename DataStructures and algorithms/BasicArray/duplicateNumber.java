//WAP to to find whether the array of integers contains a duplicate number.

import java.util.*;
class duplicateNumber{
public static void main(String[]args){
int flag = 0;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of digits: ");
int n = in.nextInt();
int[]arr = new int[n];
//input
for(int i=0;i<n;i++){
arr[i] = in.nextInt();
}
for(int i = 0;i<n;i++){
for(int j = i+1;j<n;j++){
if(arr[i]==arr[j] && i!=j){
flag=1;
System.out.println("Duplicate numbers found at locations: "+i+"and"+j);
}
}
}
if(flag==0)
System.out.println("No duplicates found!!");
}
}