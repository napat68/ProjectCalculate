import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator myCalc = new Calculator();

        while (true) {
            //สวยมั้ยยย
            System.out.println("\n========================================");
            System.out.println("     SIMPLE CALCULATOR PRO  ");
            System.out.println("========================================");
            System.out.println(" [ 7 8 9 ] [ + - ]  (พิมพ์ 'x' เพื่อออก)");
            System.out.println(" [ 4 5 6 ] [ * / ]");
            System.out.println(" [ 1 2 3 ] [ % = ]");
            System.out.println(" [   0 . ] ");
            System.out.println("----------------------------------------");

            System.out.print("  ป้อนตัวเลขแรก: ");
            while (!sc.hasNextDouble()) {
                String input = sc.next();
                if (input.equalsIgnoreCase("x")) {
                    printExitMessage();
                    return;
                }
                System.err.println("  ผิดพลาด: '" + input + "' ไม่ใช่ตัวเลข!");
                System.out.print("  กรุณาป้อนตัวเลขใหม่อีกครั้ง: ");
            }
            double n1 = sc.nextDouble();

            System.out.print("  เลือกตัวดำเนินการ (+, -, *, /, %): ");
            String op = sc.next();
            if (op.equalsIgnoreCase("x")) break;

            System.out.print("  ป้อนตัวเลขที่สอง: ");
            while (!sc.hasNextDouble()) {
                String input = sc.next();
                if (input.equalsIgnoreCase("x")) {
                    printExitMessage();
                    return;
                }
                System.err.println("  ผิดพลาด: '" + input + "' ไม่ใช่ตัวเลข!");
                System.out.print("  กรุณาป้อนตัวเลขใหม่อีกครั้ง: ");
            }
            double n2 = sc.nextDouble();

            System.out.println("\n  [กำลังคำนวณ...]");
            System.out.println("    " + n1 + " " + op + " " + n2 + " = ?");

            double finalAnswer = myCalc.calculate(n1, n2, op);
            if (!Double.isNaN(finalAnswer)) {
                System.out.println("----------------------------------------");
                System.out.println("  [คำตอบคือ]: " + finalAnswer);
                System.out.println("----------------------------------------");
            }
            
            System.out.println("\n(กด Enter เพื่อเริ่มใหม่ หรือพิมพ์ 'x' เพื่อออก)");
            sc.nextLine();
            if(sc.nextLine().equalsIgnoreCase("x")) break;
        }
        printExitMessage();
        sc.close();
    }

    private static void printExitMessage() {
        System.out.println("\n========================================");
        System.out.println("    ขอบคุณที่ใช้งาน! สวัดดีวันจันทร์... ");
        System.out.println("========================================");
    }
}