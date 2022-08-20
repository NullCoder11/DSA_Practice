import java.util.*;

class selectionSorting{
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
        
    }


public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int n = sc.nextInt();
System.out.println("Enter the elemnts: ");
int arr[] = new int[n];
//inserting the elements
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
//selection sort logic
for(int i=0;i<arr.length-1;i++){
    int smallest = i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[smallest]){
            smallest=j;
        }
    }
    //swaping
    int temp = arr[smallest];
    arr[smallest]=arr[i];
    arr[i]=temp;
}
printArr(arr);

}
}