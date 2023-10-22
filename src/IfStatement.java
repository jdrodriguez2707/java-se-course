public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSent = 3;

        if (isBluetoothEnable) {
            // Send file
            fileSent++;
            System.out.println("File sent");
        } else {
            fileSent--;
            System.out.println("Please turn on Bluetooth");
        }

        /*
        System.out.println(fileSent);
        System.out.println(isBluetoothEnable);

        boolean par = false;
        int a;
        a = par ? 2 : 3; // 3
        System.out.println(a);

        int age = 18;
        boolean adult;
        adult = (age >= 18) ? true : false;
        System.out.println("es mayor de edad: " + adult);
        */
    }
}
