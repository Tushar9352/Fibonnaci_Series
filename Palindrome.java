import java.util.Scanner;
class Palindrome
   {  
     public static void main(String [] args)
       {  
          Scanner kb=new Scanner(System.in);
          int rem,sum=0,temp;    
          System.out.println("Enter the number");
          int n=kb.nextInt();//It is the number variable to be checked for palindrome  
temp=n;    
          while(n>0)
        {    
          rem=n%10;  //getting remainder  
          sum=(sum*10)+rem;    
          n=n/10;    
         }    
      if(temp==sum)    
      System.out.println("palindrome number ");    
      else    
      System.out.println("not palindrome");    
     }  
} 
