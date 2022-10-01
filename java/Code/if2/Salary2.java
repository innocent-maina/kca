import java.util.Scanner;

public class Salary2 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    double salary = myScanner.nextDouble();
    double tax = 0;
    if (salary >= 20000) {
      tax = salary * 0.15;
    } else if (salary >= 10000 && salary < 20000) {
      tax = salary * 0.10;
    } else if (salary > 0 && salary < 10000) {
      tax = 0;
    }
    System.out.println("Your total tax is " + tax);
    System.out.println("Your net salary is: " + (salary - tax));
  }
}
