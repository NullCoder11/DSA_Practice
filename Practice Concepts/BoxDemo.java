//Parameterized constructor in java

class Box{
double width;
double height;
double depth;

//constructor
Box(double w, double h,double d){
width = w;
height = h;
depth = d;
}
double volume(){
return width*height*depth;
}
}
class BoxDemo{
public static void main(String[]args){
Box b1 = new Box(10,20,30);
Box b2 = new Box(10,15,20);

double vol;
vol = b1.volume();
System.out.println("Volume of b1 is "+vol);

vol = b2.volume();
System.out.println("Volume of b2 is: "+voljavac b);
}
}