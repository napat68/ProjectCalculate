public class Calculator {
    private double result;

    public Calculator() {
        this.result = 0;
    }

    public double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": 
                if (num2 != 0) result = num1 / num2;
                else System.out.println("Error: Division by zero");
                break;
            case "%": result = num1 % num2; break;
        }
        return result;
    }

    public double getResult() {
        return result;
    }
}