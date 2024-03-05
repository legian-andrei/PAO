package lab1.task4;
import java.util.Scanner;

public class DummyCalculator {
    private boolean isInteger(double x){
        return (int) x == x;
    }
    private void calculateD (double p1, String op, double p2){
        switch (op) {
            case "+":
                System.out.println((isInteger(p1 + p2) ? (int) (p1 + p2) : p1 + p2));
                break;
            case "-":
                System.out.println(isInteger(p1 - p2) ? (int) (p1 - p2) : p1 - p2);
                break;
            case "*":
                System.out.println(isInteger(p1 * p2) ? (int) (p1 * p2) : p1 * p2);
                break;
            case "/":
                if (p2 != 0) {
                    System.out.println(isInteger(p1 / p2) ? (int) (p1 / p2) : p1 / p2);
                } else {
                    System.out.println(Double.NaN);
                }
                break;
            default:
                System.out.println(Double.NaN);
                break;
        }
    }
    private void calculateB (boolean p1, String op, boolean p2){
        switch (op) {
            case "&&":
                System.out.println(p1 && p2);
                break;
            case "||":
                System.out.println(p1 || p2);
                break;
            default:
                System.out.println(false);
                break;
        }
    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String term1 = sc.next();
            if (term1.contains("quit")) {
                sc.close();
                return;
            }
            String op = sc.next();
            String term2 = sc.next();
            try {
                calculateD(Double.parseDouble(term1), op, Double.parseDouble(term2));
            } catch (NumberFormatException e) {
                calculateB(Boolean.parseBoolean(term1), op, Boolean.parseBoolean(term2));
            }
        }
    }
}
