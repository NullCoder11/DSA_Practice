//2. Find the minimum and maximum in an array of integers

import java.util.*;

class maxmin{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter the number of integers you want to insert: ");
int n = in.nextInt();
int [] numbers = new int[n];

//input
for(int i = 0;i<n;i++){
numbers[i]=in.nextInt();
}
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

for(int i =0;i<numbers.length;i++){
if(numbers[i]<min){
min=numbers[i];
}
if(numbers[i]>max){
max = numbers[i];
}
}
System.out.print("The largest number is: "+max);
System.out.print("The smallest number is: "+min);
}
}
