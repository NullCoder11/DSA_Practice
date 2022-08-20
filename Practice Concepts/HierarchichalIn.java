//Hierarchichal inheritence

class A{
public void printA(){
System.out.println("I am super class!");
}
}
class B extends A{
public void printB(){
System.out.println("I am B inheriting A!");
}
}
class C extends A{
public void printC(){
System.out.println("I am C inheriting A!");
}
}
class D extends A{
public void printD(){
System.out.println("I am D inheriting A!");
}
}
class HierarchichalIn{
public static void main(String[]args){
B objB = new B();
objB.printA();
objB.printB();

C objC = new C();
objC.printA();
objC.printC();

D objD = new D();
objD.printA();
objD.printD();
}
}