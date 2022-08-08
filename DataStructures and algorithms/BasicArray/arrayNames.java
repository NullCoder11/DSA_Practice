//1. Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;
import java.util.*;

class arrayNames{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of names you want to insert: ");
int n = in.nextInt();
//declaring array
String names []= new String[n];
//input
for(int i = 0;i<n;i++){
names[i] = in.next();
}
//output
for(int i=0;i<n;i++){
System.out.println("name "+(i+1)+" is: "+names[i]);
}


}
}