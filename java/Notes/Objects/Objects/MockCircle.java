import java.util.Scanner;

class MockCircle
{
    private double radius, area, circumference;

    public void getData() 
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = myScanner.nextDouble();
    }

    public void compute()
    {
        area = 3.14 * radius * radius;
        circumference = 3.14 * radius * 2;
    }

    public void display()
    {
        System.out.println("radius -----------" + radius);
        System.out.println("area -----------" + area);
        System.out.println("circumference -----------" + circumference);
    }
}