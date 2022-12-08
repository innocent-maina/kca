public class Four {
    double currentGrade;
    private static int numStudents;

    public Student(double currentGrade.int numStudents) {
        this.currentGrade = currentGrade;
        Student.numStudents = Student.numStudents + 1;
    }
    public static int getClassCount() {
        return Student.numStudents; // This is a static variable. It is accessed with the class name and not the object name. 
        // You can also use the class name to access the static variable in the main method.
        // It is significant because it is shared by all objects of the class.
    }

    public static void main(String[] args) {
        Student S1 = new Student(95.5, numStudents);
        Student S2 = new Student(76.2, numStudents);
        Student S3 = new Student(65.9, numStudents);
                // This is a static variable. It is accessed with the class name and not the object name.
                // Its significance is that it is shared by all objects of the class and is not unique to each object.
        System.out.println("Student 1 current grade =" S1.currentGrade + '%');
        System.out.println("Student 2 current grade =" S2.currentGrade + '%');
        System.out.println("Student 3 current grade =" S3.currentGrade + '%');
        System.out.println("They are" + Integer.toString(getClassCount()) + 'students!');
    } 
}