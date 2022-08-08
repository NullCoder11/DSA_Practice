//1. Taking a matrix as input and printing its elements

import java.util.*;
class matrix{
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
//output
for(int i = 0;i<rows;i++){
for(int j = 0;j<cols;j++){
System.out.print(matrix[i][j]+" ");
}
System.out.println();//for printing in new line
}
}
}