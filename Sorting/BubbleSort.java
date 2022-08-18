//Bubble sort

import java.util.*;
class BubbleSort{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
System.out.println("Enter the array elements: ");
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
//swap
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(int i =0;i<n;i++){
System.out.println(arr[i]);
}
System.out.println();
}
}