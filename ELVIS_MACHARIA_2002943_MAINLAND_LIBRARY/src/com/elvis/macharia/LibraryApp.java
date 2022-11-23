import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.sql.*;
public class LibraryApp {
x
    //array of books from category Horror
    private static String[] horrorBooks =
            {"Dracula by Bram Stoker ", "Frankenstein by Mary Shelly", "Carrie by Stephen King", "It by Stephen King", "Bad Seed by William March", "Beloved by Toni Morrison", "Bloody Chamber by Angela Carter", "Changeling by Victor La Valle", "Come Closer by Sara Gran", "Drawing by Poppy Brite", "Fiend by Peter Penson", "Fledgling by Octavia Butler", "From Hell by Alan Moore", "Horrorstor by Grady Hendrix", "The Hunger by Alma Katsu"};

    //array of books from category Documentaries
    private static String[] classicBooks =
            {"Pride and Prejudice by Jane Austen", "The Great Gasby by F.Scott", "Wuthering Heights by Bronte", "To Kill a Mocking Bird by Harper Lee", "Lord of the Rings by J.Tolkein", "Invisible Man by Ralph Ellison", "Jane Eyre by Bronte", "Middlemarch by George Elliot", "Animal Farm by George Orwell", "Color Purple by Alice Walker", "War and Peace by Leo Tolstoy", "Native Son by Richard Wright", "The Stranger by Albert Camus", "The Hobbit by J.Tolkein", "Emma by Jane austen"};

    //array of books for science and fiction
    private static String[] scienceBooks =
            {"Harry porter by JK Rowling", "Goosebumps by henry howard", "You by James Scott", "The truth by Catherine", "Silence by Aurthur", "Great by Ben", "Women by Bold", "Men by Faith", "Jews by Gideon", "Justice by george", "Death by gismo", "Caters by ben", "Tommorrow by fear", "Days in the past by hellen", "See me by maxwell"};

    //array of ISBM numbers for the books
    private static int[] isbmNumber =
            {2000199910, 2001199815, 2002199730, 2003199645, 2004199555, 2005199465, 2006199375, 2007199259, 2008199121, 2009199013, 2010198910, 2011198854, 2012198772, 2013198687, 2014198536};
    //array of return dates for the books within the library
    private static int[] returnLatePenalty =
            {150, 125, 126, 520, 450, 750, 850, 1000, 950, 250, 480, 980, 350, 650, 350};

    //specify max number of elements
    private static String[] userChoices = new String[100];
    private static int[] userDates = new int[100];
    private static int[] userNumbers = new int[100];
    //positioning variable
    private static int pos = 0;

    //value where array has reached
    private static int arrayLength = 1;

    //initiate main method main
    public static void main(String[] args) {
        //Creation of a java program
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/library_application","root","password");
            //here library_application is database name, root is the username and password is the password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }   catch(Exception e){
            System.out.println(e);
        }
        //Phase 1 the program is supposed to show welcome message hence greeting the user
        //Declare variable User
        String user;
        System.out.println(" Welcome to the Window Library" + "\n  Kindly Enter your name Below in sentence case(Aaaaaaaa)");

        //Initialise scanner to read the name of the user entered
        Scanner input;
        input = new Scanner(System.in);

        //Initialise Variable user by assigning a value from the scanner
        user = input.nextLine();

        //Print welcome message after initialisation of the user
        //if length of the choice is a number greater than one then choice is invalid
       /*if (user.length() > 1) {
            //it will be accompanied by an error message showing that the choice is invalid
            System.out.println("You have not entered any name Above" +
                    "You must insert your name to continue with the program.");
        }*/
        System.out.println("Welcome To The Window Library we thank you for joining us Dear: " + user);

        //Call on the method licence agreement once the above has been completed
        licenceAgreement();
    }

    //initiate method licence agreement
    public static void licenceAgreement() {
        System.out.println("Below are the terms and agreement for the usage of this program" +
                "\n Please read the set of instructions carefully before proceeding to the next steps" +
                "\n i. I will adhere to all library rules should be followed and I am liable for any damages i inflict" +
                "\n ii. I will respect other users by maintaining silence and peace" +
                "\n iii. I will report any mishandling of library property to the librarian" +
                "\n iv. I will not carry any drinks or foodstuff into the premises" +
                "\n v. Any queries should be addressed to the customer service desk" +
                "\n I have therefore read the terms and conditions to the best of my knowledge" +
                "\n  Do You Accept?" +
                "\n   Type Accept or yes Below");

        //Declare local variable agree
        String agree;

        //Initialise scanner
        Scanner input3;
        input3 = new Scanner(System.in);

        //Assign variable agree with a value from the scanner
        agree = input3.next();

        //initialise an array an give a memory of 4
        String[] agreeArray = new String[4];
        //Assign array possible string values that the person may enter depending on the type of case used
        agreeArray[0] = "Accept";
        agreeArray[1] = "accept";
        agreeArray[2] = "YES";
        agreeArray[3] = "yes";
        for (String s : agreeArray) {
            if (agree.equals(s)) {
                //Call Method registrationProcess if the condition is met
                authenticationAndRegistrationProcess();
            } else if (agree.equals(agreeArray[3])) {
                //Call Method registrationProcess if the condition is met
                authenticationAndRegistrationProcess();
            } else if (agree.equals(agreeArray[0])) {
                //Call Method registrationProcess if the condition is met
                authenticationAndRegistrationProcess();
            } else {
                //if the condition is not met the system is programmed to output the following error message
                System.out.println(" Denied" + "\n You have chosen not to abide by the terms and agreement licence shown above" + "\n All services provided to you by the library have therefore been restricted ");
                System.exit(0);
            }
        }
    }

    //Initialise a method authentication and registration process
    public static void authenticationAndRegistrationProcess() {
        //Phase 2 of the program the person is required to identify as a new person or a current member of the library
        //Now that the user has entered their name we wil store the name of the person in a name as a registration process
        System.out.println("Welcome again" + "\nAre you an existing member or not?" + "\n If you are a New member type yes if you are not then type no Below ");
        //Declare the variable answer
        String answer;
        //initialise scanner to receive the response of the person
        Scanner input1;
        input1 = new Scanner(System.in);
        //initialise the variable user
        answer = input1.next();
        System.out.println(" You have selected " + answer);
        String[] answersArray = new String[2];
        answersArray[0] = "YES";
        answersArray[1] = "yes";
        //System process checks whether the answer entered is a stored answer
        if (answer.equals(answersArray[1])) {
            System.out.println("You are a new user Welcome!!!");
            //call on method
            loginMenu();
        } else {
            System.out.println("You are not a new user to the program.You have been redirected to another menu!!" + "\n If you are an librarian  or a registered user");
            //call on method adminRegularMode
            adminRegularMode();
        }
    }

    public static void adminRegularMode() {

        //System process store values user will input
        int userPin;
        String username;
        //Create Scanner object
        Scanner input;
        //initialise Scanner
        input = new Scanner(System.in);
        //create Array of usernames for the registered customers
        String[] usernameArray =
                {"Myloh", "Max", "Jones"};
        //Create array of pins for the registered customers
        int[] pinsArray =
                {2112, 4040, 1917};
        //Create boolean to have value if successful
        boolean success = false;

        //Prompt user to input username and password
        System.out.print("Kindly input Registered Username: ");
        //intake username
        username = input.next();
        System.out.print("You are now requested to enter your passcode" + "\nPlease look around to ensure nobody is watching" + "\nKindly input Your Passcode: ");
        //System process intake username
        userPin = input.nextInt();

        //System process store position of username
        int userPos = -1;

        for (int i = 0; i < usernameArray.length; i++) {

            if (username.equals(usernameArray[i])) {
                userPos = i;
            }

        }
        //System process check whether the username is equal to pin
        if (userPos < 0) {
            System.out.println("Your username was not found");
        } else {
            if (userPin == pinsArray[userPos]) {
                System.out.println("Successfully Logged In");
                success = true;

            } else {
                System.out.println("Incorrect PIN.Please try again!!!");
                System.exit(0);
            }
        }
        if (success = true) {
            loginMenu();
        } else {
            System.exit(0);
        }


    }

    //initialise method login menu
    public static void loginMenu() {
        //The user is prompted to enter the username which they had used at first
        System.out.println("Enter your Name as you had previously");
        //initialise scanner
        Scanner input;
        //Declare a local variable called username
        String username;
        input = new Scanner(System.in);
        //Assign the variable a value obtained from the scanner
        username = input.nextLine();
        //once the process is complete the system will produce a message showing the user that they have successfully logged in
        System.out.println(" You have successfully logged in as " + username + " to the window library programme");
        //Call on method readers choice after the above process is complete
        readersChoice();

    }

    //initialise method readersChoice
    private static char readersChoice() {
        //in readers choice is where the user will decide on the category of books that the want
        //The category will be made available to the user in a menu displayed by the process
        System.out.println("Hello there and welcome again to window library" + "\n Below is a list of categories of books you may wish to pick ");
        System.out.println(" A.Fiction" + "\n B.Documentaries" + "\n C.Horror");
        //initialise scanner
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Choice of category: ");
        //Waiting for desired input from the user from the scanner
        String choice = input.next();
        char valueToReturn = 'D';
        //if length of the choice is a number greater than one then choice is invalid
        if (choice.length() > 1) {
            //it will be accompanied by an error message showing that the choice is invalid
            System.out.println("Please select a valid choice." +
                    "Such of the Choices  you have entered are not allowed.");
        } else {
            //Initiate the switch case due to an instance of multiple choices in the menu
            switch (choice) {
                //if the user enters a string a the code will execute as follows
                case "A":
                    valueToReturn = 'A';
                    //The code will call on the method subsequent menu to produce the second menu
                    subsequentMenu(scienceBooks, isbmNumber, returnLatePenalty, pos);
                    pos = pos + 1;
                    arrayLength = arrayLength + 1;
                    break;
                //if the user enters a string B the code will execute as follows
                case "B":
                    valueToReturn = 'B';
                    subsequentMenu(classicBooks, isbmNumber, returnLatePenalty, pos);
                    pos = pos + 1;
                    arrayLength = arrayLength + 1;
                    break;
                //if the user enters a string C the code will execute as follows
                case "C":
                    valueToReturn = 'C';
                    //The code will call on the method subsequent menu to produce the second menu
                    subsequentMenu(horrorBooks, isbmNumber, returnLatePenalty, pos);
                    pos = pos + 1;
                    arrayLength = arrayLength + 1;
                    break;
                default:
                    //If the string entered is not among the three then the following error message will be displayed
                    System.out.println("You have not selected a valid choice");

            }
        }

        return valueToReturn;
    }

    //Display any other menu
    private static char subsequentMenu(String[] bookSelection,
                                       int[] returnDatesSelection,
                                       int[] isbmNumberSelection,
                                       int positionToFill) {
        //Display list of available choices
        System.out.println("Here are some of the books in this category: ");
        //The library may have a policy in which the user can only borrow up to five books
        //If this is the case the system will produce a statement displaying this policy
        System.out.println("Kindly note that you can only borrow 5 books at a time ");
        //create array of char choices
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',};
        //For loop designed for display purposes
        for (int i = 0; i < alphabet.length; i++) {
            //The menu will be diplayed in the order of [alphabet].[Name of book].[ISBM number].[Date to be returned]
            System.out.println(alphabet[i] + ". " + bookSelection[i] +
                    " - " + returnDatesSelection[i] + "- " + isbmNumberSelection);

        }
        //In the menu the user wil see a list of avaialable options of books
        //To access this books the user will be prompted to enter the letter assigned to the book
        //Warning the letters must be case sensitive
        System.out.println("To choose a book kindly write the letter assigned to it below " + "\n The letters you put must be in UPPERCASE");
        System.out.println("Selection: ");
        //Input user string choice
        Scanner input;
        input = new Scanner(System.in);
        String choice = input.next();
        char valueToReturn = 'P';
        //The program is designed to check whether the user did infact give a letter
        //This is determined by checking whether the it is small than 1 in terms of length
        if (choice.length() > 1) {
            //If the value of the length is infarct less than one then the system prints an error message stating that it is an invalid choice
            System.out.println("Please select a valid choice");
        } else {
            //If the choice variable satisfies the condition then the program proceeds to the switch case loop
            //Here the program  validates the presence of actual character
            switch (choice) {
                //The user is now given a chance to choose which of the books they want
                //The user is free to choose any letter representing the books
                //This results in a variety of choices thus the programmer is prompted to input a scenario of all the possible outcomes for the user
                //This results now in the need to construct a case for each letter as shown below
                //Below are 15 cases of the possible outcomes the user can pick and how the choices affect the program

                // book options
                //If he user opts o choose the book A then he code executes following he instructions for case A
                case "A":
                    valueToReturn = 'A';
                    userChoices[positionToFill] = bookSelection[0];
                    userNumbers[positionToFill] = isbmNumberSelection[0];
                    userDates[positionToFill] = returnDatesSelection[0];
                    System.out.println("Do you want to pick another choice?");
                    Scanner sc;
                    sc = new Scanner(System.in);
                    String alternative;
                    alternative = sc.nextLine();
                    String alternativeArray[] = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    //System process checks whether the answer entered is a stored answer
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {

                        pos = pos + 1;
                        arrayLength = arrayLength + 1;

                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);

                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book B then he code executes following he instructions for case B
                case "B":
                    valueToReturn = 'B';
                    userChoices[positionToFill] = bookSelection[1];
                    userDates[positionToFill] = returnDatesSelection[1];
                    userNumbers[positionToFill] = isbmNumberSelection[1];
                    System.out.println("Do you want to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    //System process checks whether the answer entered is a stored answer
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book C then he code executes following he instructions for case C
                case "C":
                    valueToReturn = 'C';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book D then he code executes following he instructions for case D
                case "D":
                    valueToReturn = 'D';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book A then he code executes following he instructions for case E
                case "E":
                    valueToReturn = 'E';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book A then he code executes following he instructions for case F
                case "F":
                    valueToReturn = 'F';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book A then he code executes following he instructions for case G
                case "G":
                    valueToReturn = 'G';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book A then he code executes following he instructions for case H
                case "H":
                    valueToReturn = 'H';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book A then he code executes following he instructions for case I
                case "I":
                    valueToReturn = 'I';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book J then he code executes following he instructions for case J
                case "J":
                    valueToReturn = 'J';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book K then he code executes following he instructions for case K
                case "K":
                    valueToReturn = 'K';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book L then he code executes following he instructions for case L
                case "L":
                    valueToReturn = 'L';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book M then he code executes following he instructions for case M
                case "M":
                    valueToReturn = 'M';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book N then he code executes following he instructions for case N
                case "N":
                    valueToReturn = 'N';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();
                    }
                    break;
                //If he user opts o choose the book O then he code executes following he instructions for case O
                case "O":
                    valueToReturn = 'O';
                    userChoices[positionToFill] = bookSelection[2];
                    userDates[positionToFill] = returnDatesSelection[2];
                    userNumbers[positionToFill] = isbmNumberSelection[2];
                    System.out.println("Would you wish to pick another choice?");
                    sc = new Scanner(System.in);
                    alternative = sc.nextLine();
                    alternativeArray = new String[2];
                    alternativeArray[0] = "no";
                    alternativeArray[1] = "yes";
                    if (alternative.equals(alternativeArray[0])) {
                        printReceipt();
                    } else if (alternative.equals(alternativeArray[1])) {
                        pos = pos + 1;
                        arrayLength = arrayLength + 1;
                        subsequentMenu(bookSelection,
                                returnDatesSelection,
                                isbmNumberSelection,
                                pos);
                    } else {
                        pos++;
                        arrayLength++;
                        readersChoice();

                        break;
                    }
                    //If any of the above characters do not relate t what the user has input then the default reply will be as follows
                    //The system will be prompted to print an error message
                default:
                    System.out.println("You have picked an invalid choice.Please try again Kindly");
            }

            return valueToReturn;
        }
        return valueToReturn;
    }

    // last and final stage of the program
    // This is where the program prints out the receipt of the books borrowed by the user
    //Method printReceipt
    private static void printReceipt() {
        System.out.println(" Here is a receipt of books borrowed." + "\n You are required to present this receipt when returning the books " + "\n Please visit us again. Thank you!!!!!");

        //This dictates the format in which the current date and time of the user is borrowing the books
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        //This is the scanner that is used to determine the date and time
        LocalDateTime now = LocalDateTime.now();

        //This is the print
        System.out.println("You have borrowed the books below at this time and date: " + dtf.format(now));

        //Receipt design
        System.out.println("------------------------------------------------------------------------------------------");

        //Total cost of goods purchased
        int total = 0;
        for (int i = 0; i < arrayLength; i++) {
            total = total + userNumbers[i];
            System.out.println((i + 1) + ". " + userChoices[i] + " ISBM Number: " + userDates[i] + " Amount due If late: " + userNumbers[i]);
            System.out.println("------------------------------------------------------------------------------------------");

        }
        System.out.println("Grand Total cost of books if returned late: Shs" + total);
        System.out.println("Thank you again for your visit to our library." + "\n we hope you have found what you needed " + "\n Goodbye");
        System.out.println("\uD83D\uDC7D" + "\uD83D\uDC7D" + "\uD83D\uDC7D" + "\uD83D\uDC7D" + "\uD83D\uDC7D");

        System.exit(0);
    }
}
