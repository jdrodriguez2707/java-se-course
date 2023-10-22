public class IncrementDecrement {
    public static void main(String[] args) {
        byte lives = 5;
        lives--;
        System.out.println(lives);
        lives++;
        System.out.println(lives);

        int gift = (100 + ++lives);
        System.out.println(gift);
        System.out.println(lives);
    }
}
