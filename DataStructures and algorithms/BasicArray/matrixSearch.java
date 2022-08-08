//1. Searching for an element x in a matrix

import java.util.*;
class matrixSearch{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int rows = in.nextInt();
System.out.println("Enter the number of coloumns: ");
int cols = in.nextInt();
//declaring 2-d array
int matrix[][] = new int[rows][cols];
//input
//rows
for(int i = 0;i<rows;i++){
//coloums
for(int j=0;j<cols;j++){
matrix [i][j] = in.nextInt();
}
}
//number to be found
System.out.println("Enter the element which you want to find: ");
int x = in.nextInt();

for(int i = 0;i<rows;i++){
for(int j = 0;j<cols;j++){
if(matrix[i][j]==x){
System.out.println("x found at location: "+i+","+j);
}
}

}
}
}