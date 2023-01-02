import java.util.Scanner;

public class ArrayExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array;
    int n, index;

    System.out.print("Enter the number of elements in the array: ");
    n = input.nextInt();
    array = new int[n];

    // input values for the array
    for (int i = 0; i < n; i++) {
      System.out.print("Enter a value for the array: ");
      array[i] = input.nextInt();
    }

    // print an element of the array
    System.out.print("Enter the index of the element you want to print: ");
    index = input.nextInt();
    try {
      System.out.println("The element at index " + index + " is: " + array[index]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index! The array has a length of " + array.length);
    }
  }
}
