import java.util.Scanner;

class WahomeEmployee {
  private String employee_name, employee_id;
  private int year_of_birth;
  private double basic_salary, allowances, gross, tax_amount, net_salary;


  public void input() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the employee name");
    employee_name = myScanner.nextLine();
    // employee_id
     System.out.println("Enter the employee id");
    employee_id = myScanner.nextLine();

    System.out.println("Enter the year_of_birth");
    year_of_birth = myScanner.nextInt();

    System.out.println("Enter the basic_salary");
    basic_salary = myScanner.nextDouble();

    System.out.println("Enter the allowances");
    allowances = myScanner.nextDouble();

    System.out.println("Enter the gross");
    gross = myScanner.nextDouble();

    System.out.println("Enter the tax_amount");
    tax_amount = myScanner.nextDouble();

    System.out.println("Enter the net_salary");
    net_salary = myScanner.nextDouble();
  }

  public void compute() {
          gross = basic_salary + allowances;

      if(gross >= 20000)
         tax_amount = 10.0 / 100 * gross;
      else
         tax_amount = 0;

      net_salary = gross - tax_amount;
  }

  public void output() {
      System.out.println("Employee ID: " + employee_id);
      System.out.println("Name: " + employee_name);
      System.out.println("Year of Birth: " + year_of_birth);
      System.out.println("Basic Salary: " + basic_salary);
      System.out.println("Allowances: " + allowances);
      System.out.println("Gross Salary: " + gross);
      System.out.println("Tax Amount: " + tax_amount);
      System.out.println("Net Salary: " + net_salary);
  }

  public static void main(String args[]) {

    WahomeEmployee newEmployee = new WahomeEmployee();
    newEmployee.input();
    newEmployee.compute();
    newEmployee.output();
  }
}
