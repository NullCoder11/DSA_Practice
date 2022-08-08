//3. Take an array of numbers as input and check if it is an array sorted in ascending order

import java.util.*;
class arraySort{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.print("Enter the number of input: ");
int n = in.nextInt();
int numbers[]=new int[n];

//input
for(int i = 0;i<n;i++){
numbers[i]=in.nextInt();
}
boolean isAscending = true;
for(int i = 0;i<numbers.length-1;i++){//numbers.length-1 is termination condition
//condition for descending order
if(numbers[i]>numbers[i+1]){

isAscending = false;
}
}
if(isAscending){
System.out.println("The array is sorted in ascending order!");
}else
System.out.println("The array is not sorted in ascending order!!");
}
}