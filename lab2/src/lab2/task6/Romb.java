package lab2.task6;

public class Romb extends Paralelogram{
    public int diag1, diag2;
    public Romb(int d1, int d2){
        super(0,0,0);
        this.diag1 = d1;
        this.diag2 = d2;
    }
    public double arie(){
        return (diag1 * diag2) / 2;
    }
}
