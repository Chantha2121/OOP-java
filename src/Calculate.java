import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number a: ");
        int a = input.nextInt();
        System.out.print("Enter the Number b: ");
        int b = input.nextInt();
        System.out.print("Enter the operactor: ");
        String operator = input.next();
        int sum = 0;
        switch (operator) {
            case "+" -> sum = a + b;
            case "-" -> sum = a - b;
            case "*" -> sum = a * b;
            case "/" -> sum = a / b;
            default -> System.out.println("Enter the Operator (+, -, *, /)");
        }
        System.out.println("Sum of a and b = "+sum);
    }
}
