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
                else {
                    System.out.println("Error: ไม่สามารถหารด้วยศูนย์ได้");
                    return Double.NaN;
                }
                break;
            case "%": result = num1 % num2; break;
            default:
                System.out.println("Error: ตัวดำเนินการไม่ถูกต้อง");
                return Double.NaN;
        }
        return result;
    }
}