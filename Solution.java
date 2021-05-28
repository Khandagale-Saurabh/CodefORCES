import java.util.*;
class Solution {
    public  static String[] findOcurrences(String text, String first, String second)
    {

       String s1[]=text.split(" ");//new String[text.length()];
        //s1=text.split(" ");
        int f=0;int s=0;
        ArrayList<String> a1=new ArrayList();
        for(int i=0;i<s1.length;i++)
        {

            if(s1[i].equals(first))
            {
              int j=i;
			  f=j+2;
			 }

        }

        for(int i=0;i<s1.length;i++)
        {
		 if(s1[i].equals(second))
		 			 {
		 			    int j=i;
		 			    s=j+2;
			  }
		}



        if(f+2>s1.length)
        {
          // System.out.println(s1.length()-1);
           a1.add(s1[s1.length-1]);
		 }
		 else{
		   // System.out.println("  "+s1[f]);
		    a1.add(s1[f]);
		  }


		          if(s+2>s1.length)
		          {

         // System.out.println(s1.length()-1);
           a1.add(s1[s1.length-1]);

		  		 }
		  		 else{
		  		 //   System.out.println("  "+s1[f]);
		  		   a1.add(s1[f]);
		  }
		  System.out.println(a1);
        return s1;
    }
    public static void main(String aaa[]){
	  String text="alice is a good girl she is a good student";
	  String ss[]=findOcurrences(text,"a","good");
	 }
}
