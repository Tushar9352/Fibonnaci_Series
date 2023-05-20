class Prime
{
 public int IsPrime(int n)
  {
   
   if(n==1||n==0)
     {
        return 1;
     }
   for (int i=2;i<n;i++)
    {
       if(n%i==0)    
         {
             return 1;
         }
    }
    return 0;
 }
}
class UsePrime
{
  public static void main(String [] args)
   {
       Scanner kb=new Scanner(System.in);
       System.out.println("Enter a number to check whether it is prime or not?");
       int n=kb.nextInt();
      Prime obj=new Prime();
       int g=obj.IsPrime(n);
if (g==0)
       { 
       System.out.println("Prime number");
       }
       else
       {
       System.out.println("Non Prime Number");
       }
   }
}
