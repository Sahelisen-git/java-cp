import java.util.*;
public class Triplets{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    int i,j,k,sum=1,n;
    n=arr.length;
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n-2;i++){
        for(j=i+1;j<n-1;j++){
            for(k=j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==sum){
                    System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
                }
            }
        }
    }
    sc.close();
}
}