import java.util.*;
import java.lang.*;
 
public class ReverseString
{
    public static void main(String args[]){
        String str="Manisha";
        String rStr;
         
        //Reversing String
        rStr="";
        for(int loop=str.length()-1; loop>=0; loop--)
            rStr= rStr + str.charAt(loop);
         
        System.out.println("Reversed string is: " + rStr);
    }
}
