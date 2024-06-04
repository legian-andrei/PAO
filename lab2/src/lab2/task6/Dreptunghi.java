package lab2.task6;

public class Dreptunghi extends Paralelogram{
    public Dreptunghi(int l1, int l2){
        super(l1, l2, 90);
    }
    public double arie() {
        return latura1 * latura2;
    }
}
