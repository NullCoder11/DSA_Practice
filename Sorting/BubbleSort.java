//Bubble sort
//Bubble sort

import java.util.*;
class BubbleSort{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
System.out.println("Enter the array elements: ");
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
bubble(arr);
System.out.print(Arrays.toString(arr));
}
static void bubble(int arr[]){
    boolean swap;
    for(int i=0;i<arr.length;i++){
        swap=false;
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                //if swap takes place
                swap=true;
            }
        }
        if(!swap){
            break;
        }
    }
}
}
