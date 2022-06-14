package Poligonos;

public class Triangulo extends Poligono {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangulo(double firstSide, double secondSide, double thirdSide) {
        super(3);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public double getArea() {
        // Fórmula de Herón
        double s = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }

    @Override
    public String toString() {
        return "Triangulo de lados " + firstSide + ", " + secondSide + " y " + thirdSide +
                ".\nTiene un area de " + getArea() + ". \n" + super.toString();
    }
}
