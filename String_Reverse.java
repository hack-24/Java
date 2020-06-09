import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean isPallindrome=false;
       

      int i=0;
      int j=A.length()-1;
       while(i<=j){

       if(A.charAt(i)!=A.charAt(j)){
           
        isPallindrome=false;
        break;
       }

       else{

           isPallindrome=true;
       }

           i++;
           j--;

       }


      if(isPallindrome){

          System.out.println("Yes");
      }
       
     else
     System.out.println("No");
        
      



           



       }
        
    }




