package challenges;

public class FirstExercise {
    public static void main(String[] args) {
        // My family

        final char NAME_INITIAL = 'J';
        final String MON_NAME = "Nerys";
        final String DAD_NAME = NAME_INITIAL + "hon";
        final String DOG_NAME = "Frosty";
        final String MY_NAME = NAME_INITIAL + "ohan";

        byte momAge = 39;
        byte dadAge = 42;
        byte dogAge = 7;
        byte myAge = 19;

        float momWeight = 75.25F;
        float dadWeight = 79.76F;
        float dogWeight = 5.9F;
        float myWeight = 69.72F;

        int population = 51609000;

        short houseNumber = 24131;

        System.out.println("This is my family👪");
        System.out.println("We're four:");
        System.out.println("My mom " + MON_NAME + " has " + momAge + " years old" + " and weighs " + momWeight + "kg");
        System.out.println("My dad " + DAD_NAME + " has " + dadAge + " years old" + " and weighs " + dadWeight + "kg");
        System.out.println("My dog " + DOG_NAME + " has " + dogAge + " years old" + " and weighs " + dogWeight + "kg");
        System.out.println("My name's " + MY_NAME + ". I'm " + myAge + " years old" + " and weigh " + myWeight + "kg");
        System.out.println("We're living in Barranquilla/Colombia where" + " there are " + population + " inhabitants" + " and our house number is " + houseNumber);
    }
}
