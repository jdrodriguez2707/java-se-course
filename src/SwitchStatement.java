public class SwitchStatement {
    public static void main(String[] args) {
        String selectedColorMode = "Light";

        // Obsolete way of using switch
        switch (selectedColorMode) {
            case "Light":
                System.out.println("You chose the 'Light' color mode");
                break;
            case "Night":
                System.out.println("You chose the 'Night' color mode");
                break;
            case "Blue Dark":
                System.out.println("You chose the 'Blue Dark' color mode");
                break;
            case "Dark":
                System.out.println("You chose the 'Dark' color mode");
                break;
            default:
                System.out.println("Please select a color mode");
        }

        // Enhanced switch -> Java 12+
        /*
        int day = 1;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("I don't know");
        }

         */

        // Switch solo admite tipos de datos como byte, short, int, char, String. No admite long, float, double o boolean
    }
}
