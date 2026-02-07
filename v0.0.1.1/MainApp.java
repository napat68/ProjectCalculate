import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator myCalc = new Calculator();

        while (true) {
            System.out.println("\n========================================");
            System.out.println("      SIMPLE CALCULATOR ARRAY-BASED      ");
            System.out.println("========================================");
            System.out.println(" [ 7 8 9 ] [ + - ]  (พิมพ์ 'x' เพื่อออก)");
            System.out.println(" [ 4 5 6 ] [ * / ]");
            System.out.println(" [ 1 2 3 ] [ % = ]");
            System.out.println(" [   0 . ] ");
            System.out.println("----------------------------------------");
            System.out.print(" ป้อนโจทย์: ");

            String input = sc.nextLine().replace(" ", ""); //เพิ่มส่วนนี้ เป็นการลบช่องว่างออกของโจทย์เช่น 3 + 5 เป็น 3+5

            if (input.equalsIgnoreCase("x")) break;
            if (input.isEmpty()) continue;

            System.out.println("\n  [กำลังประมวลผลด้วย Array System...]");
            
            double finalAnswer = myCalc.evaluateExpression(input);

            if (!Double.isNaN(finalAnswer)) {
                System.out.println("----------------------------------------");
                System.out.println("   โจทย์: " + input);
                System.out.println("   คำตอบคือ: " + finalAnswer);
                System.out.println("----------------------------------------");
            } else {
                System.err.println("   ผิดพลาด: รูปแบบสมการไม่ถูกต้อง!");
            }

            System.out.println("\n(กด Enter เพื่อต่อ หรือ 'x' เพื่อออก)");
            if(sc.nextLine().equalsIgnoreCase("x")) break;
        }
        printExitMessage();
        sc.close();
    }

    private static void printExitMessage() {
        System.out.println("\n========================================");
        System.out.println("    ขอบคุณที่ใช้งาน! ขอให้ถูกหวย :) 10101001011110000101");
        System.out.println("========================================");
    }
}