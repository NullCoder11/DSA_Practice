//multiple inheritance using the concept of Interfaces in Java

interface man {
public void father();
}
interface woman {
   public void mother();
}
interface Child extends woman, man{
public void infant();
}
public class multi_inherit{
public static void main(String[] args){
Child child = new Child() {
public void father() {
System.out.println("I am the father");
}
public void mother() {
System.out.println("I am the mother");
}
public void infant() {
System.out.println("I am the child");
}
};
child.father();
child.mother();
child.infant();
}
}