package lab2.task6;

public class Paralelogram extends Patrulater{
    public Paralelogram(int l1, int l2, double u){
        super(l1, l2, l1, l2, u, 180-u, u, 180-u);
    }
    public double arie() {
        return latura1 * latura2 * Math.sin(Math.toRadians(unghi1));
    }
}
