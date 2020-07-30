import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

         int H[]=new int[26];
         String c=a.toLowerCase();
         String d=b.toLowerCase();
         
         //if the length of both strings are not equal return false
         if(c.length()!=d.length()){
             return false;
         }



          //Scan the first String and Increment the Values by +1 in the auxiliary array(i.e at H[i])

         for(int j=0;j<c.length();j++){

             H[c.charAt(j)-97]+=1;



         }

          //Scan the second String and decrement the values by -1 in the auxilixary array
          for(int k=0;k<d.length();k++){
              H[d.charAt(k)-97]-=1;
               //if H[i] becomes  < 0 return false
              if(H[d.charAt(k)-97] <0){

                 return false;

              }


          }

             //else return true
          return true;



        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}