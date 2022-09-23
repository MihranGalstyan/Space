/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class SwitchKeys {
    public static void main(final String[] args) {
        int input = 5;
        String[] months = {
                "January", "February", "March",
                "April", "May", "Jun",
                "July", "August", "September",
                "October", "November", "December"};

        switch (input) {
            case 1:
                System.out.println(months[0]);
                break;
            case 2:
                System.out.println(months[1]);
                break;
            case 3:
                System.out.println(months[2]);
                break;
            case 4:
                System.out.println(months[3]);
                break;
            case 5:
                System.out.println(months[4]);
                break;
            case 6:
                System.out.println(months[5]);
                break;
            case 7:
                System.out.println(months[6]);
                break;
            case 8:
                System.out.println(months[7]);
                break;
            case 9:
                System.out.println(months[8]);
                break;
            case 10:
                System.out.println(months[9]);
                break;
            case 11:
                System.out.println(months[10]);
                break;
            case 12:
                System.out.println(months[11]);
                break;
            default:
                System.out.println("Wrong number");
                break;
        }

        switch (input) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Autumn");
            default -> System.out.println("Wrong month");
        }
    }
}
