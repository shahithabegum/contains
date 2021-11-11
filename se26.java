import java.util.*;
import java.lang.*;
class se26
{
  public static void main(String arg[])
   {
     try
         {
            String s,s1="and";
            Scanner t=new Scanner(System.in);
	System.out.println("enter string");
	s=t.nextLine();
	
	System.out.println(s.contains(s1));
	 
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}