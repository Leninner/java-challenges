package POO.src.ClasesYMetodos;

public class Coche {
  // Atributos
  String color;
  String marca;
  int km;

  // Método Constructor
  public Coche(String _nombre, String _color, int _km) {
    color = _color;
    marca = _nombre;
    km = _km;
  }

  // Métodos
  public void arrancar(String marca, String color) {
    System.out.println("El coche de marca " + marca + " de color " + color + " está arrancando");
  }

  public void acelerar() {
    km += 10;
  }

  public void frenar() {
    km -= 10;
  }

  public void mostrarKm() {
    System.out.println("El coche tiene " + km + " km");
  }

}
