//Default or non-argument constructors

import java.util.*;
class dConst{
int num ;
String name;
//invoking while an obj of the class is created
dConst(){
System.out.println("Default Constructor called");
}
}

class Constructors{
public static void main(String[]args){
//invoking default constructor
dConst d = new dConst();

System.out.println(d.num);
System.out.println(d.name);
}
}