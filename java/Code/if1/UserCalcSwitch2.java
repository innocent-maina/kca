import java.util.Scanner;

public class UserCalcSwitch2 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter two numbers to calculate: ");
    int num1 = myScanner.nextInt();
    int num2 = myScanner.nextInt();
    System.out.println("Enter an operator (+, -, *, / or %): ");
    char operator = myScanner.next().charAt(0);
    switch (operator) {
      case '+':
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        break;
      case '-':
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;
      case '*':
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        break;
      case '/':
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        break;
      case '%':
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        break;
    }
  }
}
