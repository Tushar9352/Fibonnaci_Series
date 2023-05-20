import java.util.Scanner;
class ReverseString
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");
        
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String reverse = "";
for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }
}
