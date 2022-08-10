//WAP to delete a number from an array

import java.util.*;
class delete{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n=in.nextInt();
int []arr= new int[n];
System.out.println("Enter the elements: ");
for(int i=0;i<n;i++){

arr[i]=in.nextInt();
}
System.out.println("Enter the position from which the array has to be deleted: ");
int pos = in.nextInt();
//deleting
for(int i = pos;i<n-1;i++){
arr[i]=arr[i+1];

}
n--;
System.out.println("The array after deletion is: ");
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}