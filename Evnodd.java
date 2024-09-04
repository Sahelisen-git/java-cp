import java.util.*;
public class Evnodd{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the elements");
    int n=arr.length,i;
    for(i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
    int nofevn=0,nofodd=0;
    System.out.println("even numbers");
    for(i=0;i<n;i++){
        if(arr[i]%2==0){
            nofevn++;
            System.out.println(arr[i]);
        }
    }
    System.out.println("odd numbers");
    for(i=0;i<n;i++){
        if(arr[i]%2!=0){
            nofodd++;
            System.out.println(arr[i]);
        }
    }
    sc.close();
}
}