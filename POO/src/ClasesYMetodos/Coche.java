package POO.src.ClasesYMetodos;

public class Coche {
  // Atributos
  String color;
  String marca;
  int km;

  // Métodos
  public void arrancar() {
    System.out.println("Arrancando el coche");
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
