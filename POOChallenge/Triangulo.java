package POOChallenge;

public class Triangulo {
    // Diseñar un programa para trabajar con triángulos isósceles.
    // Para ello defina los atributos necesarios que se requieren,
    // proporcione métodos de consulta, un método constructor e
    // implemente métodos para calcular el perímetro y el área de un
    // triángulo, además implementar un método que a partir de un arreglo
    // de triángulos devuelva el área del triángulo de mayor superficie.
    private float sideOne;
    private float sideTwo;
    private float base;

    public Triangulo(float sideOne, float base) {
        this.sideOne = this.sideTwo = sideOne;
        this.base = base;
    }

    public float getPerimeter() {
        return this.sideOne + this.sideTwo + this.base;
    }

    public double getArea() {
        double altura =
                Math.sqrt(Math.pow(this.base, 2) - Math.pow(this.sideOne
                        , 2));

        return Math.round(((this.base * altura) / 2) * 100.0) / 100.0;
    }

    public String getInfo() {
        return "Triangulo de lados " + this.sideOne + " y " + this.sideTwo + " y base " + this.base + " tiene perimetro " + this.getPerimeter() + " y area " + this.getArea();
    }
}
