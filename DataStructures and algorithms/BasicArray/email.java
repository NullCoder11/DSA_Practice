//3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.*;
class email{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the emailid: ");
String email=in.next();
String username = "";

for(int i =0;i<email.length();i++){
if(email.charAt(i)=='@'){
break;
}else{
username = username+email.charAt(i);
}
}
System.out.println("The username generated is: "+username);
}
}