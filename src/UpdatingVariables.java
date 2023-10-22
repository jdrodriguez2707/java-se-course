public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        // Bonus: $200
        salary += 200;
        System.out.println(salary);

        // Pension: $50 off
        salary -= 50;
        System.out.println(salary);

        // 2 extra hours $30 each
        // Meal: $45
        salary += (2 * 30) - 45;
        System.out.println(salary);

        // Updating text strings
        String employeeName = "David Rodriguez";
        employeeName += " Castro";
        System.out.println(employeeName);

        employeeName = "Johan " + employeeName;
        System.out.println("Employee name: " + employeeName);

    }
}
