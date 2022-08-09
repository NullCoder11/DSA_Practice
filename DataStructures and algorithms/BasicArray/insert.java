//WAP to insert a number at a given location in an array.

import java.util.*;
class insert{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of elements to be inserted in the array: ");
int n = in.nextInt();
int[]arr=new int[100];
for(int i=0;i<n;i++){
arr[i]=in.nextInt();
}
System.out.println("Enter the number to be inserted: ");
int el= in.nextInt();
System.out.println("Enter the position at which it is to be inserted: ");
int pos = in.nextInt();
++n;
for(int i=n-1;i>=pos;i--){
arr[i] = arr[i-1];
}
arr[pos-1]=el;


System.out.println("The array after insertion is: ");
for(int i=0;i<n;i++){

System.out.println(arr[i]);

}
}
}