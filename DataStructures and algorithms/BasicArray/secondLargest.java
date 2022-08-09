//WAP to find the second largest of n numbers using an array.

import java.util.*;
class secondLargest{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = in.nextInt();
int[]numbers = new int[n];
//input
for(int i=0;i<n;i++){
numbers[i]=in.nextInt();

}
int large=numbers[0];
int pos = 0;
for(int i = 1;i<n;i++){
if(numbers[i]>large){
 large=numbers[i];
 pos=i;
}
}
int second_large = numbers[1];
for(int i=0;i<n;i++){
if(numbers[i]!=large){
if(numbers[i]>second_large)
second_large=numbers[i];
}
}
System.out.println("The largest element is: "+large);
System.out.println("The second largest element is: "+second_large);
}
}