import java.util.*;
 public class Arm{
int n;
Arm(int n){
    this.n=n;
}
void calfact(int n){
    int c=0,i,temp=n,sum=0,p,rem;
    while(temp!=0){
        temp/=10;
        c++;
    }
    temp=n;
    while(temp!=0){
     rem=temp%10;
     p=1;
     for(i=1;i<=c;i++){
        p=p*rem;
     }
     sum+=p;
     temp/=10;
    }
    if(sum==n){
        System.out.print(sum+"yes armstrong");
    }
    else
    System.out.print(n+"no armstrong");

}
}
class Demo{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        Arm x=new Arm(num);
        x.calfact(num);
    }
}