/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Space {
    public static void main(final String[] args) {

        //Array initialisation
        int[] nums = {1, 5, 3, 6, 8, 8};

        //STRING data type
        String text = "Hello World";

        System.out.println(text);

        String firstName = "Norman";
        String lastname = "Freeman";
        String result = firstName + " " + lastname + ", " + "you are 36 years old";

        System.out.println(result);

        String[] months = {
                "January", "February", "March",
                "April", "May", "Jun",
                "July", "August", "September",
                "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i]);
            if (i < months.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }

    }
}
