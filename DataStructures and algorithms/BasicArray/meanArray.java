//WAP to find the mean of n numbers using arrays.

import java.util.*;

class meanArray{
public static void main(String[]args){
int sum = 0;
double mean= 0.0;
Scanner in = new Scanner(System.in);
System.out.print("Enter the number of numbers you ant to find mean of: ");
int n = in.nextInt();
int[]numbers = new int[n];

//input
for(int i = 0;i<n;i++){
numbers[i]=in.nextInt();
}
//output
for(int i =0;i<n;i++){
sum = sum+numbers[i];
mean = (double)sum/n;

}
System.out.println("Sum of the given arrays: "+sum);
System.out.println("The mean of elements is: "+mean);
}
}