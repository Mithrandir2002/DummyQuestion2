import java.util.Scanner;

public class DummyQuestion 
{
   public static void main(String[] args) 
   {
        ModifiedArray arr = new ModifiedArray();
        MergeSort m = new MergeSort();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of an array: ");
        int sz = Integer.valueOf(sc.nextLine());
        int[] a = new int[sz];
        for (int i = 0; i < sz; i++)
        {
            System.out.println("Input number: ");
            a[i] = Integer.valueOf(sc.nextLine());

        }
        
        System.out.println("Original array: ");
        for (int i = 0; i < sz; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        m.mergeSort(a, 0, a.length - 1);
        int[] newA = arr.modifiedArr(a, 0);
        
        System.out.println("Modified array: ");
        for(int i = 0; i < newA.length; i++)
        {
            System.out.print(newA[i] + " ");
        }
        System.out.println();
   } 
}
