
public class WhileLoop {
    static boolean isFlashlightOn = true;

    public static void main(String[] args) {
        turnOnOffFlashlight();

        int i = 1;

        while (isFlashlightOn && i <= 10) {
            printSOS();
            i++;
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
        //isFlashlightOn = !isFlashlightOn;
        isFlashlightOn = (isFlashlightOn) ? false : true;
    }
}



