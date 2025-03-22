import java.util.*;
public class Main {
    public static boolean isValid(String s)
    {
        char[] stack=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch=='(')||(ch=='[')||(ch=='{'))
            {
                top++;
                stack[top]=ch;
            }
            else
            {
               if(top==-1)
                   return false;
               else
               {
                   char topelement=stack[top];
                   if((ch==')' && topelement=='(')||(ch=='}'&& topelement=='{')||(ch==']'&& topelement=='['))
                   {
                       top--;
                   }
                   else {
                       return false;
                   }
               }
            }
        }
        return top==-1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(isValid(str))
        {
            System.out.println("Valid parentheses");
        }
        else {
            System.out.println("Invalid paraenthese");
        }
    }
}

