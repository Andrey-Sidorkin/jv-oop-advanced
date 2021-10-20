package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double findArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: right triangle, area: %.1f sq.units, firstLeg: %.1f units, "
                + "secondLeg: %.1f units, color: %s\n",
                findArea(), firstLeg, secondLeg, super.getColor());
    }
}