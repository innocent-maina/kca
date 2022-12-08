public class PrintGivenList {
    public static void main(String[] args) {
        int i;
        String[] family = new String[4];

        family[0] = "Father";
        family[1] ="Mother";
        family[2] = "Brother";
        family[3] = "Sister";

        System.out.println("The members of that family are: ->");

        for(i = 0; i < 4; i++)
        {
            System.out.println(family[i]);
        }
    }
}
