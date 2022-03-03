package POO.src.ClasesYMetodos;

public class Main {
  public static void main(String[] args) {
    Coche c1 = new Coche("Ford", "Rojo", 0);
    c1.arrancar(c1.marca, c1.color);
    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    c1.mostrarKm();
    c1.frenar();
    c1.mostrarKm();

    Coche c2 = new Coche("Fiat", "Azul", 0);
    c2.color = "Azul";
    c2.marca = "Audi";
    c2.km = 0;
    c2.arrancar(c2.marca, c2.color);
    c2.acelerar();
    c2.acelerar();
    c2.acelerar();
    c2.mostrarKm();
    c2.frenar();
    c2.mostrarKm();

  }
}
