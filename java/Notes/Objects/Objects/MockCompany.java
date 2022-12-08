class MockCompany
{
    public static void main(String[] args)
    {
        MockEmployee employee1 = new MockEmployee();
    MockEmployee employee2 = new MockEmployee();
    MockEmployee employee3 = new MockEmployee();

    System.out.println("Enter the details for the first employee");
    employee1.input();

    System.out.println("Enter the details for the second employee");
    employee2.input();

    System.out.println("Enter the details for the third employee");
    employee3.input();

    System.out.println("-----------------Compute values--------------------");
    employee1.compute();
    employee2.compute();
    employee3.compute();

    System.out.println("---------------------Display 1-----------");
    employee1.display();
    System.out.println("---------------------Display 2-----------");
    employee2.display();
    System.out.println("---------------------Display 3-----------");
    employee3.display();
    }
}