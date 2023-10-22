public class LogicalOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        System.out.println("Is a equal to b? -> " + (a == b));
        System.out.println("Is a different from b? -> " + (a != b));

        System.out.println("Is a greater than b? -> " + (a > b));
        System.out.println("Is a less than b? -> " + (a < b));
        System.out.println("Is a greater than or equal to b? -> " + (a >= b));
        System.out.println("Is a less than or equal to b? -> " + (a <= b));

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a != b || a < b) {
            System.out.println("a is different from b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else if (a >= b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("a is less than or equal to b");
        }
    }
}
