package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(String marca, String matricula, String modelo, int cilindrada) {
        super(marca, matricula, modelo);
        this.cilindrada = cilindrada;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCilindrada: " + cilindrada;
    }
}
