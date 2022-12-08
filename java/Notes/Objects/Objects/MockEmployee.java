import java.util.Scanner;

class MockEmployee
{
    private int id;
    private String name;
    private double salary;
    private double tax;

    public void input()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the employee id");
        id = myScanner.nextInt();
        System.out.println("Enter the employee name");
        name = myScanner.nextLine();
        System.out.println("Enter the employee salary");
        salary = myScanner.nextDouble();
    }

    public void compute()
    {
        tax = salary * 0.2;
    }

    public void display()
    {
        System.out.println("The employee id is " + id);
        System.out.println("The employee name is " + id);
        System.out.println("The employee salary is " + id);
        System.out.println("The employee tax is " + tax);
    }
}