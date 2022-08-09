//WAP to to enter n number of digits. Form a number using these digits.

import java.util.*;
class formNumber{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
System.out.println("Enter the number of digits: ");
int n = in.nextInt();
int[]digits = new int[n];
//input
for(int i=0;i<n;i++){

digits[i]=in.nextInt();
}
int i=0;
int number = 0;
while(i<n){
number = (int)(number+digits[i]*(Math.pow(10,i)));
i++;
}
System.out.println("The number is: "+number);
}
}