import java.util.Scanner;
class GCD
{
  public int gcd(int a,int b)
    {
       if (b==0)
          {
             return a;
          }
       else
          {
               return gcd(b,a%b);
           }
      }
}class UseGCD
{
  public static void main(String[] args)
  {
       Scanner kb=new Scanner(System.in);
       System.out.println("Enter 2 numbers:");
       int a=kb.nextInt();
       int b=kb.nextInt();
       GCD obj=new GCD();
       int g= obj.gcd(a,b);
       System.out.println("GCD is :"+g);
   }
}
 
