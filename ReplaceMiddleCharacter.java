import java.util.*;
public class Dem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int len=ch.length/2;
        ch[len]='*';
        if(ch.length%2==0)
        {
            ch[len-1]='*';
        }
        String str=new String(ch);
        System.out.println("Replace String: ");
        System.out.print(str);
    }
}
/* Input:Enter a String: abc@1234
  Output:Replaced String :abc**234
