import java.io.*;
import java.util.*;
//()()
//(())
public class Main {

    public static void main(String[] args) throws Exception
    {
        Stack<Character> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String ss="";
      for(int i=0;i<str.length();i++)
      {
          char ch=str.charAt(i);
          if(ch==')')
          {
              if(st.peek()=='(')
              {

			   System.out.println(st);

                return;
              }

              while(st.peek()!='(')
              {
                  st.pop();
              }
              st.pop();

          }
          else
          {
              st.push(ch);
          }
      }
      System.out.println("false");
      return;
    }

}
