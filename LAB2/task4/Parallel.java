package LAB2.task4;

public class Parallel extends Circuit {
    private Circuit a, b;
    private double v;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        double r1 = a.getResistance();
        double r2 = b.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() { return v; }

    @Override
    public void applyPotentialDiff(double V) {
        this.v = V;
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);



    }

}