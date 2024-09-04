import java.util.*;
public class Symmetric {
    public static void main(String[] args) { 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no of rows");
  int rows=sc.nextInt();
  System.out.println("enter the no of coloumns");
  int coloumns=sc.nextInt();
  int i,j;
  int arr[][]=new int[rows][coloumns];
  for(i=0;i<rows;i++){
    for(j=0;j<coloumns;j++){
        System.out.print("Element [" + i + "][" + j + "]: ");
        arr[i][j]=sc.nextInt();
    }
  }
  int n=arr.length;
  for(i=0;i<n;i++){
    for(j=i+1;j<n;j++){
        if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0] ){
            System.out.print("("+arr[i][1]+" "+arr[i][0]+")");
        }
    }
  }
 /*  for(i=0;i<rows;i++){
    for(j=0;j<coloumns;j++){
        System.out.print(arr[i][j]+" ");
    }
  }*/

}
}