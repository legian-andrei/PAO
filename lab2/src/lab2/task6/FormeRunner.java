package lab2.task6;

public class FormeRunner {
    public static void main(String[] args) {
//        https://ocw.cs.pub.ro/courses/poo/laboratoare/04
        Paralelogram paral = new Paralelogram(4, 5, 30);
        System.out.println(paral.arie());

        Dreptunghi drept = new Dreptunghi(4, 5);
        System.out.println(drept.arie());

        Romb romb = new Romb(4, 5);
        System.out.println(romb.arie());

        Patrat ptr = new Patrat(4);
        System.out.println(ptr.arie());
    }
}
