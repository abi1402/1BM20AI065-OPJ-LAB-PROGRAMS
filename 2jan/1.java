import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double num1, num2;
    String operator;
    double result = 0;
    boolean continueCalculating = true;

    while (continueCalculating) {
      System.out.print("Enter the first number: ");
      num1 = input.nextDouble();
      System.out.print("Enter the second number: ");
      num2 = input.nextDouble();
      System.out.print("Enter the operator (+, -, *, /): ");
      operator = input.next();

      switch (operator) {
        case "+":
          result = num1 + num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "/":
          try {
            result = num1 / num2;
          } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
            result = 0;
          }
          break;
        default:
          System.out.println("Invalid operator!");
          result = 0;
          break;
      }

      System.out.println("Result: " + result);

      System.out.print("Do you want to continue calculating (y/n)? ");
      String choice = input.next();
      if (choice.equals("n")) {
        continueCalculating = false;
      }
    }
  }
}
