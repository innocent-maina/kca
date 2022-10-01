import java.util.Scanner;

public class GenderTax3 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the gender of the person");
    String gender = myScanner.nextLine();
    System.out.println("Enter the salary of the person");
    double salary = myScanner.nextDouble();
    double tax = 0;
    if (gender == "female") {
      if (salary >= 15000) {
        tax = salary * 0.14;
      } else if (salary < 15000) {
        tax = salary * 0.12;
      }
    } else if (gender == "male") {
      if (salary >= 14000) {
        tax = salary * 0.15;
      } else if (salary < 14000) {
        tax = salary * 0.13;
      }
    }
    System.out.println("The tax of the employee is " + tax);
  }
}
