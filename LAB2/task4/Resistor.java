package LAB2.task4;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor(double r) {
        this.resistance = r;
    }

    @Override
    public double getResistance() { return resistance; }

    @Override
    public double getPotentialDiff() { return potentialDifference; }

    @Override
    public void applyPotentialDiff(double V) { this.potentialDifference = V; }
}



