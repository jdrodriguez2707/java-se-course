public class Functions {
    public static void main(String[] args) {
        // Single line comment

        /*
        * Multi line
        * comment
        *
        * */

        /**
         * Comment for
         * Java Docs
         *
         * */

        double y = 3;

        calculateCircleArea(y);
        calculateSphereArea(y);
        calculateSphereVolume(y);

        /*
        System.out.println(calculateCircleArea(y));
        System.out.println(calculateSphereArea(y));
        System.out.println(calculateSphereVolume(y));
        */

        System.out.println(convertToDollar(1000, "MXN"));
        System.out.println(suma(5, 5));
    }

    /*
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSphereArea(double radius) {
            return 4 * Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSphereVolume(double radius) {
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }
    */

    /**
     * Calculates the area of a circle by specifying its radius and prints the result on the screen.
     * @param radius circle radius
     * */
    public static void calculateCircleArea(double radius) {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }

    /**
     * Calculates the area of a sphere by specifying its radius and prints the result on the screen.
     * @param radius circle radius
     * */
    public static void calculateSphereArea(double radius) {
        System.out.println(4 * Math.PI * Math.pow(radius, 2));
    }

    /**
     * Calculates the volume of a sphere by specifying its radius and prints the result on the screen.
     * @param radius circle radius
     * */
    public static void calculateSphereVolume(double radius) {
        System.out.println(((double) 4 / 3) * Math.PI * Math.pow(radius, 3));
    }


    /**
     * Converts any amount of money to dollar by specifying the currency.
     * @param amount amount of money to convert.
     * @param currency the currency code (MXN or COP).
     * @return the amount of money updated in dollars.
     * */
    public static double convertToDollar(double amount, String currency) {
        switch (currency) {
            case "MXN":
                amount *= 0.057;
                break;
            case "COP":
                amount *= 0.00025;
                break;
            default:
                System.out.println("Please enter the currency of your country (MXN or COP)");
        }

        return amount;
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
