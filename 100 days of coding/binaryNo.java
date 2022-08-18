/* The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:
int OperationsBinaryString(char* str);
The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:
– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same. */

import java.util.*;
class binaryNo{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
String str = sc.next();
if(str == null){
System.out.println("-1");
}
else{
int res = str.charAt(0)-'0';
for(int i=1;i<str.length();){
char prev = str.charAt(i);
i++;
if(prev=='A')
res = res &(str.charAt(i) - '0');
else if(prev == 'B')
res = res | (str.charAt(i)-'0');
else
res = res ^ (str.charAt(i)-'0');
i++;
}
System.out.println(res);
}
}
}