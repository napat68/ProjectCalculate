public class Calculator {
    public double calculate(double n1, double n2, String operator) {
        double result = 0.0;
        switch (operator) {
            case "+":result = n1 + n2;
                break;
            case "-":result = n1 - n2;
                break;
            case "*":result = n1 * n2;
                break;
            case "/":if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error: Division by zero");
                    result = Double.NaN;
                }
                break;
            case "%":
                result = n1 % n2;
                break;
            default:
                System.out.println("Error: Invalid operator");
                result = Double.NaN;
        }

        return result;
    }
}