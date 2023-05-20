import java.util.Scanner;
class SortedArray
{
public static void main(String [] args)
  {
     Scanner kb=new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n=kb.nextInt();
     int c;
     int [] arr=new int[n];
     System.out.println("Enter "+n+ " Numbers");
for (int i=0;i<arr.length;i++)
       {
          arr[i]=kb.nextInt();
       }
      for (int i=0;i<arr.length;i++)
       {
          for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                  {
                      c=arr[i];
                      arr[i]=arr[j];
                       arr[j]=c;
                    }
             }
         }
  System.out.println("Sorted array is ");
      for (int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
  }
}
