import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    private double result;

    public double evaluateExpression(String expression) {

        String[] numbersArr = expression.split("(?<=[-+*/%])|(?=[-+*/%])");
        List<String> tokens = new ArrayList<>(Arrays.asList(numbersArr));
        
        // ลบช่องว่างที่อาจปนมา
        tokens.removeIf(String::isBlank);

        try {
            //จัดการเกียวกับ *, /, %
            for (int i = 0; i < tokens.size(); i++) {
                String token = tokens.get(i);
                if (token.equals("*") || token.equals("/") || token.equals("%")) {
                    double left = Double.parseDouble(tokens.get(i - 1));
                    double right = Double.parseDouble(tokens.get(i + 1));
                    double res = 0;
                    
                    if (token.equals("*")) res = left * right;
                    else if (token.equals("/")) res = left / right;
                    else if (token.equals("%")) res = left % right;

                    tokens.set(i - 1, String.valueOf(res));
                    tokens.remove(i);
                    tokens.remove(i);
                    i--;
                }
            }

            //จัดการเกียวกับ +, -
            this.result = Double.parseDouble(tokens.get(0));
            for (int i = 1; i < tokens.size(); i += 2) {
                String op = tokens.get(i);
                double nextVal = Double.parseDouble(tokens.get(i + 1));
                
                if (op.equals("+")) result += nextVal;
                else if (op.equals("-")) result -= nextVal;
            }
            return result;

        } catch (Exception e) {
            return Double.NaN;
        }
    }
}