public class MathematicalOperations {
    public static void main(String[] args) {
        float x = 2.1F;
        float y = 3;

        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // System.out.println(Math.pow(x, y));
        // System.out.println(Math.sqrt(y));
        // System.out.println(Math.max(x, y));
        // System.out.println(Math.ceil(x));
        // System.out.println(Math.ceil(x));

        // Área de un círculo (pi * r^2)
        // System.out.println(Math.PI * Math.pow(y, 2));

        // Área de una esfera (4 * pi * r^2)
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volumen de una esfera ((4/3) * pi * r^3)
        System.out.println(((double) 4 / 3) * Math.PI * Math.pow(y, 3));

        System.out.println(Math.random());
    }
}
