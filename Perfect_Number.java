   import java.util.Scanner;
class PerfectNumber
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        n = s.nextInt();
for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is Perfect");
        }
       else
        {
            System.out.println("Given number is not Perfect");
        }    
    }
  
}
