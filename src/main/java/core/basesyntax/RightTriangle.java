package core.basesyntax;

public class RightTriangle implements Figure {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public RightTriangle(Color color, double firstLeg) {
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
