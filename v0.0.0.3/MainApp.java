import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator myCalc = new Calculator();

        while (true) {
            System.out.println("\n======= เครื่องคิดเลข (พิมพ์ 'exit' เพื่อออก) =======");
            
            System.out.print("ป้อนตัวเลขที่ 1: ");
            while (!sc.hasNextDouble()) { 
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) return;
                System.out.print("พิมตัวอักษรไม่ได้! กรุณาป้อนตัวเลขใหม่: ");
            }
            double n1 = sc.nextDouble();

            System.out.print("เลือกตัวดำเนินการ (+, -, *, /, %): ");
            String op = sc.next();
            if (op.equalsIgnoreCase("exit")) break;

            System.out.print("ป้อนตัวเลขที่ 2: ");
            while (!sc.hasNextDouble()) {
                String input = sc.next();
                if (input.equalsIgnoreCase("exit")) return;
                System.out.print("พิมตัวอักษรไม่ได้! กรุณาป้อนตัวเลขใหม่: ");
            }
            double n2 = sc.nextDouble();

            System.out.println("\n[กระบวนการ]: " + n1 + " " + op + " " + n2 + " = ?");

            double finalAnswer = myCalc.calculate(n1, n2, op);
            if (!Double.isNaN(finalAnswer)) {
                System.out.println("[คำตอบ]: " + finalAnswer);
            }
        }
        System.out.println("ปิดโปรแกรมเครื่องคิดเลข...");
        sc.close();
    }
}