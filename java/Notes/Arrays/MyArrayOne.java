public class MyArrayOne {
    public static void main(String[] args) {
        String[] units = new String[3];
        int i;

        units[0] = "java";
        units[1] = "computer graphics";
        units[2] = "distributed systems";

        System.out.println("The units provided are: ");
        for(i = 0; i < 3; i++) {
            System.out.println(units[i]);
        }
    }
}