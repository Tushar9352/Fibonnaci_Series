import java.util.Scanner;
class Fibonacci
{
   public void series(int n)
     {
        int a=0,b=1,sum,i;
        for(i=1;i<=n;i++)
          {
   	System.out.println(a +" ");
                 sum=a+b;
                 a=b;
                 b=sum;
           }
      }
}
class UseFibonacci
{
    public static void main(String [] args)
      {
         Scanner kb=new Scanner(System.in);
         System.out.println("Enter the Nth term of Fibonacci Series:");
         int n=kb.nextInt();
         Fibonacci obj=new Fibonacci();
         obj.series(n);
      }
}
