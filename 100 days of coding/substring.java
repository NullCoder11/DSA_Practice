//WAP to print substring of a string

import java.util.*;
class substring{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string: ");
String str=sc.nextLine();
for(int i=0;i<str.length();i++){
for(int j = i+1;j<=str.length();j++){
System.out.println(str.substring(i,j));
}
}
}
}

//Time complexity: O(n^3)
//Auxilary space: O(1)