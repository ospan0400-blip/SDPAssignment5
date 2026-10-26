public class Main {
    static void main(String[] args) {

        System.out.println("Adding two numbers:");
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println(calculator.calculate(5,7));

        System.out.println("Multiplying two numbers:");
        calculator.setStrategy(new MultiplyStrategy());
        System.out.println(calculator.calculate(4, 9));

        System.out.println("Substracting two numbers:");
        calculator.setStrategy(new SubtractStrategy());
        System.out.println(calculator.calculate(79.2, 9.2));
    }
}
