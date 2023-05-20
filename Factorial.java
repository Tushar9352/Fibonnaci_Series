import java.util.Scanner;

class Fact
{
 public static void main(String [] args)
 {
  Scanner kb=new Scanner(System.in);
  int n,fact=1;
  System.out.println("Enter  a  number");
  n=kb.nextInt();
while(n>1)
  {
   fact=fact*n;
   n--;
  }
 System.out.println("factorial is "+fact);
 }
}
