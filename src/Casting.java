public class Casting {
    public static void main(String[] args) {
        float dogsMonthly = 30.0F / 12.0F;
        //System.out.println(dogsMonthly);
        byte dogsEstimatedMonthly = (byte) dogsMonthly;
        //System.out.println(dogsEstimatedMonthly);

        //byte a = 30;
        //byte b = 12;
        //System.out.println((float) a / b);

        char number = '1';
        int nI = number;
        System.out.println(nI);
        short nS = (short) number;
        System.out.println(nS);

        byte a = 30;
        byte b = 12;

        float c = (float) a / b;
        System.out.println(c);

        /*
        String age = "19";
        int ageI = Integer.parseInt(age);
        System.out.println(ageI);
        */

        String age = "19";
        int ageI = Integer.parseInt(age);
        System.out.println(ageI);
    }
}
