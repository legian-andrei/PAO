package lab1.task4;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DummyCalculator {
    private int calculateI (int p1, String op, int p2){

    }
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        String term1 = sc.next();
        String op = sc.next();
        String term2 = sc.next();
        try {
            Integer.parseInt(term1);
            System.out.println(calculateI(Integer.parseInt(term1), op, Integer.parseInt(term2)));
        } catch (NumberFormatException) {

        }
    }
}
