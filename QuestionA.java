import java.util.*;
public class QuestionA
{
	 private static boolean isStringLowerCase(String str){

	        //convert String to char array
	        char[] charArray = str.toCharArray();

	        for(int i=0; i < charArray.length; i++){

	            //if any character is not in lower case, return false
	            if( !Character.isLowerCase( charArray[i] ))
	                return false;
	        }

	        return true;

    }


   public static void main(String aa[])
   {
     Scanner sc=new Scanner(System.in);

    int num=sc.nextInt();


    ArrayList<String> a1=new ArrayList<String>();


      if(num>=1 && num<=100)
	      {


      				for(int i=1;i<=num;i++)
      				  {
							String a=sc.next();
                            boolean str11=isStringLowerCase(a);

							int len=a.length();
                               if(str11==(true))
                             {

						     	if(len>=1 &&len<=100)
      				             {      // System.out.println(len);
      					               if(a1.contains(a))
      					            {
							    	 System.out.println("Yes");
							    	}
							     else
							     	{
							    	 System.out.println("No");

							      	}
							     a1.add(a);
      					          }
						 }
						 else
						 {
							 System.exit(0);
							 }

						}
      				 // System.out.println(""+a1);
      					  a1.clear();

     	  }
     	else
     	   {
			System.out.println("Length is invalid");
			}
   }
}
