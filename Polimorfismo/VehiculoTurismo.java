package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public VehiculoTurismo(String marca, String matricula, String modelo, int nPuertas) {
        super(marca, matricula, modelo);
        this.nPuertas = nPuertas;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + "\nNumero de puertas: " + nPuertas;
    }
}
