import java.util.Scanner;
public class BasicCalc {
    public static void main(String args[]) {
        System.out.println("This is a basic calculator!");
        calc();
    }

    static void calc() {
        String operations[] = {"add", "sub", "mul", "div"};
        
        while (true) {
            System.out.println("\nEnter the first number : ");
            double num1 = new Scanner(System.in).nextDouble();

            System.out.println("Enter the first number : ");
            double num2 = new Scanner(System.in).nextDouble();

            System.out.println("Enter the operation : " + operations);
            String oprn = new Scanner(System.in).nextLine();

            switch (oprn) {
                case "add":
                    System.out.println(findSum(num1, num2));
                    break;
                
                case "sub":
                    System.out.println(findDifference(num1, num2));
                    break;
                
                case "mul":
                    System.out.println(findProduct(num1, num2));
                    break;
            
                case "div":
                    System.out.println(findDivison(num1, num2));
                    break;
                
                default:
                    System.out.println("[EXCEPTION] Bad input!");
                    break;
            }
        }
    }

    protected static String findSum(double num1, double num2) {
        return "The sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
    }

    protected static String findDifference(double num1, double num2) {
        return "The difference between " + num1 + " and " + num2 + " is " + (num1 - num2);
    }

    protected static String findProduct(double num1, double num2) {
        return "The product of " + num1 + " and " + num2 + " is " + (num1 * num2);
    }

    protected static String findDivison(double num1, double num2) {
        if (num2 != 0.0) { return "The division of " + num1 + " by " + num2 + " is " + (num1 / num2); }
        else { return "[ERROR] Divide by zero case"; }
    }
}
