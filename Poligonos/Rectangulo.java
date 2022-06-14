package Poligonos;

public class Rectangulo extends Poligono {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Rectangulo de base " + base + " y altura " + altura +
                ".\nTiene un area de " + getArea() + ". \n" + super.toString();
    }
}
