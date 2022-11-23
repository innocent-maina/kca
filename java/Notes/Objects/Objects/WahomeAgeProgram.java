import java.util.Scanner;

class Person {
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int givenAge) {
    age = givenAge;
  }

}

public class WahomeAgeProgram {
  public static void main(String args[]) {
    Scanner myScanner = new Scanner(System.in);

    Person person1 = new Person();
    Person person2 = new Person();

    int theAge1, theAge2;

    person1.setAge(23);

    System.out.println("Enter the age of the second person");
    theAge2 = myScanner.nextInt();
    person2.setAge(theAge2);

    theAge1 = person1.getAge();

    System.out.println("The age of person 1 is " + theAge1);
    System.out.println("The age of person 2 is " + theAge2);
  }
}
