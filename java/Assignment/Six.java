//         6) Write a program that accepts a set of integers (the user decides how many) and then stores them in an array. The main function then passes these values one by one to a method called get_even which returns 1 if the integer is even and 0 if it is odd. The main function should then specify which numbers were even, which ones were odd and their respective totals. It should also specify how many numbers were odd and how many were even. For example, if the user enters 25 34 56 17 14 20, the output should be: -
// 25 is an odd number
// 34 is an even number
// 56 is an even number
// 17 is an odd number
// 14 is an even number
// 20 is an even number  

import java.util.Scanner;

public class Six {


    public static int get_even(int number) {
        if((number % 2) == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int i, j, temp;
        int[] numbers = new int[5];

        System.out.print("How many numbers do you want to enter? ");
        numbers = new int[myScanner.nextInt()];
        System.out.println("Enter " + numbers.length + " numbers: ");

        // get data
        for(i = 0;i < numbers.length;i++)
        {
           numbers[i] = myScanner.nextInt();
        }

        // check if numbers are odd or even by passing through the get_even function
        for(i = 0;i < numbers.length;i++)
        {
            if(get_even(numbers[i]) == 1) {
                System.out.println(numbers[i] + " is an even number");
            } else {
                System.out.println(numbers[i] + " is an odd number");
            }
        }

        // give the total number of odd and even numbers

        int oddTotal = 0;
        int evenTotal = 0;
        int oddSum = 0;
        int evenSum = 0;

        for(i = 0;i < numbers.length;i++)
        {
            if(get_even(numbers[i]) == 1) {
                evenTotal++;
                // add all the even numbers together
                evenSum += numbers[i];
            } else {
                oddTotal++;
                // add all the odd numbers together
                oddSum += numbers[i];
            }
        }

        System.out.println("There is a total of " + oddTotal + " odd numbers and their sum is " + oddSum);
        System.out.println("There is a total of " + evenTotal + " even numbers and their sum is " + evenSum);



    }
}



// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    


// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    (Question 7)

// Multiple inheritance is a feature that allows a class to inherit characteristics and features from more than one parent class. Multiple inheritance is supported in C++ and Python, but not in Java. This is because Java does not support multiple inheritance of classes, but it does support multiple inheritance of interfaces.

// Multiple inheritance is not supported in Java because it can lead to ambiguity. Consider the following example:

 

// The above code will give the following output:

// Default B

// The reason for this is that if a class implements two interfaces that both contain a default method with the same name and signature, then the compiler will not know which default method to use. It will give an error if the class does not provide an implementation of the method.

// The solution to this problem is to override the default method with a method of the same name in the class that implements the interface. The class can then call the default method using super. For example:


=======

// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    
// Answer: Java 8 introduced a new feature called default methods. Default methods are methods that are defined in interfaces and can be used by the implementing classes without any extra effort. 


// What are the advantages of default methods?
// Answer: Default methods are a good way to extend interfaces without breaking existing implementations. Default methods enable us to add new methods to the interfaces and provide the implementation without affecting the classes that implement this interface. 

// What are the disadvantages of default methods?
// Answer: Default methods in Java 8 are a good way to extend interfaces without breaking existing implementations. However, default methods are not the best choice for adding new methods to the interfaces. Default methods are not the best choice for adding new methods to the interfaces because they are not inherited by the classes that implement this interface. 


// What are the advantages of default methods?
// Answer: Default methods are a good way to extend interfaces without breaking existing implementations. Default methods enable us to add new methods to the interfaces and provide the implementation without affecting the classes that implement this interface. 

// What are the disadvantages of default methods

=======

// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    

// Answer: It allows you to use multiple interfaces with the same default method. If you have a class that implements two interfaces that both have the same default method, you can override the method in the class and it will be used instead of the default method. You can also call the default method directly from the class. If you don't override the method, the default method in the interface that is implemented first will be used.

// Path: Assignment/Seven.java
//         7) Recent versions of Java added default methods to interfaces. What is the impact of this with respect to multiple inheritance?    



// In Java, what is the difference between a class and an interface?    

// Answer: A class is a concrete implementation of an object while an interface is a contract. A class can implement multiple interfaces but only extend one class. Interfaces can only contain abstract methods, constants and static methods. Classes can contain abstract methods, constants, static methods and instance methods. Classes can also contain instance variables. Interfaces cannot contain instance variables. Classes must implement all abstract methods of an interface. Interfaces cannot be instantiated.

// Path: Assignment/Eight.java
//         8) In Java, what is the difference between a class and an interface?    



// Recent versions of Java added default methods to interfaces. What is the impact of this with respect to multiple inheritance?    (2 marks)

    // Multiple inheritance is a feature that allows a subclass to inherit characteristics and features from more than one parent. Java doesn't support multiple inheritance as it doesn't support multiple inheritance. However, Java 8 introduced default methods to interfaces which is a step closer to multiple inheritance. Default methods allow interfaces to have a default implementation so that classes implementing the interface don't have to implement the methods themselves. This means a class can implement multiple interfaces and inherit the default methods from both interfaces. This is similar to multiple inheritance as it allows a class to inherit characteristics from multiple parent classes.

// Explain the difference between a static and non-static inner class. (2 marks)

    // A static inner class is a class that is declared static. It can be accessed without instantiating the outer class, using other static methods. A non-static inner class is a class that is declared non-static. It can only be accessed by creating an instance of the outer class. A static nested class cannot access non-static data members and methods. It can access static data members and methods only. A non-static nested class can access both static and non-static data members and methods.

// What is the difference between an abstract class and an interface? (2 marks)

    // An abstract class is a class that is declared abstract. It may or may not include abstract methods. It cannot be instantiated, and can only be used as a superclass. An interface is a completely abstract class that contains only abstract methods. It can be used to achieve abstraction. It is used to achieve multiple inheritance in Java. It cannot be instantiated. It can have static methods which can be accessed without the need for any object.

// Explain the difference between a checked and an unchecked exception. (2 marks

=======

// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    Explain with an example.

// The impact of this with respect to multiple inheritance is that now we can have two interfaces with the same method name but with different implementations. This is because the method is now a default method and not an abstract method. This is a good thing because it allows us to have a method in two interfaces that can have different implementations. This is possible because the compiler will now know which implementation to use.




// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    ----> Multiple inheritance is not allowed in java. So, we can't extend a class and implement an interface at the same time. But, with default methods we can. This is the impact of default methods with respect to multiple inheritance. 

// What is the difference between an abstract class and an interface?  ----> An abstract class can have abstract and non-abstract methods. It can have final, non-final, static and non-static variables. An interface has only abstract methods. It can have only public, static and final variables. It cannot have a constructor. It can extend another Java interface only. An abstract class can extend another Java class and implement multiple Java interfaces. It can be extended using keyword "extends". It can be implemented using keyword "implements". 

// What is a marker interface?  ----> A marker interface is an interface that has no data members and methods. It is used to provide some essential information to the JVM so that it can perform some useful operations. For example, Serializable, Cloneable, Remote etc. are marker interfaces. 

// What is a functional interface?   ----> A functional interface is an interface that contains only one abstract method. It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class. 

// What is a default method?  ----> A default method is a method that is added to the interfaces to provide the backward compatibility. It provides a default implementation so that the classes which are implementing the interfaces do not need to implement the methods. 

// What is a static method?  ----> A static method is a method that is added to the interfaces to provide the backward compatibility. It provides a static implementation so that the classes which are implementing the interfaces do not need to implement the methods.

=======

// dded default methods to interfaces. What is the impact of this with respect to multiple inheritance?    (2 marks)
// Answer:  Default methods are methods that are implemented in an interface.  Default methods are a way to extend interfaces in a backward-compatible manner.  Default methods are useful when you want to add new functionality to an existing interface.  Default methods are useful when you want to add new functionality to an existing interface.  Default methods allow you to add new methods to an interface without breaking existing code that implements that interface.

// What is a lambda expression?   (2 marks)
// Answer:  A lambda expression is an anonymous function that is used to create a single method.  Lambda expressions are used as an alternative to anonymous classes.  Lambda expressions are used primarily to define inline implementation of a functional interface, i.e., an interface with a single method only.  Lambda expressions are also known as closures as they provide a way to close over the environment.  Lambda expressions are used in collection library to iterate, filter and extract data from collection.

// What is the difference between a static method and an instance method?   (2 marks
