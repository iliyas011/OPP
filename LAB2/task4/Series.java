package LAB2.task4;

public class Series extends Circuit {
    private Circuit a, b;
    private double v;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() { return v; }

    @Override
    public void applyPotentialDiff(double V) {
        this.v = V;
        double current = V / getResistance();
        a.applyPotentialDiff(current * a.getResistance());
        b.applyPotentialDiff(current * b.getResistance());
    }
}