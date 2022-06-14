package Poligonos;

public abstract class Poligono {
    protected int numberOfSides;

    public Poligono(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String toString() {
        return "Número de lados: " + numberOfSides;
    }

    // Declaramos el método área como abstracto
    public abstract double getArea();
}
