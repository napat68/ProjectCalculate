import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator myCalc = new Calculator();

        System.out.println("--- Simple Calculator Program ---");

        System.out.println("Buttons: 0 1 2 3 4 5 6 7 8 9");
        System.out.println("Operators: + - * / %");

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.println("\n[Process]: " + n1 + " " + op + " " + n2 + " = ?");

        double finalAnswer = myCalc.calculate(n1, n2, op);

        System.out.println("[Answer]: " + finalAnswer);

        sc.close();
    }
}