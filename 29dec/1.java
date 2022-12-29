import java.util.Scanner;

class interact
{
 public static void main(String args[])
 {
  String x;
  Scanner Scan=new Scanner(System.in);
  System.out.println("Enter a statement:");
  x=Scan.nextLine();
  System.out.println("Length of the statement:"+x.length());
  System.out.println(x.toUpperCase());
 }
}
