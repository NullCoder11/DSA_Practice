//WAP tp print the position of the smallest number of n numbers using arrays.

import java.util.*;
class smallestPos{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = in.nextInt();
int[]numbers = new int[n];
//input
for(int i=0;i<n;i++){
numbers[i]=in.nextInt();
int small=numbers[0];
int pos = 0;
}
int small=numbers[0];
int pos = 0;
for(int i = 1;i<n;i++){
if(numbers[i]<small){
 small=numbers[i];
 pos=i;
}
}
System.out.println("The smallest element is: "+small);
System.out.println("The position of smallest element is: "+pos);
}
}