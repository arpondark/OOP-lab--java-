import java.util.Scanner;

class Calculator {
    private int num1;
    private int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Add() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Both numbers must be positive for addition.");
        }
        return num1 + num2;
    }

    public int Subtract() throws ArithmeticException {
        if (num1 < 0
         || num2 < 0) {
            throw new ArithmeticException("Both numbers must be positive for subtraction.");
        }
        return num1 - num2;
    }

    
    public int Multiply() throws ArithmeticException {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Neither number can be zero for multiplication.");
        }
        return num1 * num2;
    }

    
    public int Division() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("The divisor cannot be zero.");
        }
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter two integers for addition: ");
            int a1 = Integer.parseInt(scanner.next());
            int a2 = Integer.parseInt(scanner.next());
            Calculator obj1 = new Calculator(a1, a2);
            System.out.println("Addition result: " + obj1.Add());

         
            System.out.print("Enter two integers for subtraction: ");
            int s1 = Integer.parseInt(scanner.next());
            int s2 = Integer.parseInt(scanner.next());
            Calculator obj2 = new Calculator(s1, s2);
            System.out.println("Subtraction result: " + obj2.Subtract());

            
            System.out.print("Enter two integers for multiplication: ");
            int m1 = Integer.parseInt(scanner.next());
            int m2 = Integer.parseInt(scanner.next());
            Calculator obj3 = new Calculator(m1, m2);
            System.out.println("Multiplication result: " + obj3.Multiply());

            
            System.out.print("Enter two integers for division: ");
            int d1 = Integer.parseInt(scanner.next());
            int d2 = Integer.parseInt(scanner.next());
            Calculator obj4 = new Calculator(d1, d2);
            System.out.println("Division result: " + obj4.Division());

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
