//2.Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//Example : 
//original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”

import java.util.*;
class replace{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
String user = in.next();
String result = "";

for(int i=0;i<user.length();i++){
if(user.charAt(i)=='e'){
result = result + 'i';
}else{
result =result+user.charAt(i);
}
}
System.out.println(result);
}

}