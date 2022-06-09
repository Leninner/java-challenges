package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(String marca, String matricula, String modelo, int carga) {
        super(marca, matricula, modelo);
        this.carga = carga;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + "\nCarga: " + carga;
    }
}
