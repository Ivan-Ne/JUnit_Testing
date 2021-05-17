public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add("2", "3"));

        System.out.println(calculator.decrease(10, 5));
        System.out.println(calculator.decrease("15", "10"));

        System.out.println(calculator.divide(4, 2));
        System.out.println(calculator.divide("10", "2"));

        System.out.println(calculator.multiply(6, 5));
        System.out.println(calculator.multiply("10", "2"));

        System.out.println(calculator.power(2, 2));
        System.out.println(calculator.power("3", "3"));
    }
}
