import java.util.*;
public class Intepolation {
    public static void interpolation(int arr[],int item){

        int beg=0,end=arr.length-1;
        while(beg<=end){
            nt mid = beg + ((item - arr[beg]) * (end - beg)) / (arr[end] - arr[beg]);
            if(item==arr[mid]){
                System.out.println(mid);
                break;
            }
            else if(item<arr[mid]){
                end=mid-1;
            }
            else{
                beg=mid+1;
            }
        
        }
          if(beg>end){
            System.out.println("item not found");
          }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    int i;
    int n=arr.length;
    for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("entre the item");
    int item=sc.nextInt();
    interpolation(arr,item);
    }
}
