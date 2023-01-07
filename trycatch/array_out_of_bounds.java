import java.util.*;
public class array_out_of_bounds {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        int arr[] = new int [4];
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter array element");
            int d = sc.nextInt();
            arr[i]=d;
        }

        System.out.println("Enter array element you want to access");
        int ele = sc.nextInt();

        try
        {
            System.out.println("Element at pos"+ele+"is ="+arr[ele]);
        }

        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Out of bound");
        }


    }
}
