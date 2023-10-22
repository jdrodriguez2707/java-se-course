public class ForLoop {
    static boolean isFlashlightOn = false;

    public static void main(String[] args) {
        /*
        turnOnOffFlashlight();

        if (isFlashlightOn) {
            for (int i = 1; i <= 10; i++) {
                printSOS();
            }
        }
        */


        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }


        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println("Par: " + i);
        }
    }

    /**
     * Prints SOS on screen in Morse code
     */
    public static void printSOS() {
        System.out.println("... ___ ...");
    }

    /**
     * Changes the state of the flashlight depending on what state it is in at the moment
     */
    public static void turnOnOffFlashlight() {
        isFlashlightOn = !isFlashlightOn;
    }
}
