import java.util.*;
public class OddString {
    public static void freq(String str){
        HashMap<Character,Integer> charMAp=new HashMap<>();
          char ch[]=str.toCharArray();
          for(char c : ch)
          {
             if(charMAp.containsKey(c)){
                charMAp.put(c,charMAp.get(c)+1);
             }  
             else
             charMAp.put(c,1);      
          }
System.out.println(str+"="+charMAp);
    }
 public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("output is");
freq(str);
 }
}
