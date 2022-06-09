package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] misVehiculos = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("Ford", "ABC123", "Focus");
        misVehiculos[1] = new VehiculoDeportivo("Ferrari", "DEF456", "F40", 488);
        misVehiculos[2] = new VehiculoFurgoneta("Seat", "GHI789", "Ibiza", 5);
        misVehiculos[3] = new VehiculoTurismo("Renault", "JKL012", "Megane", 5);

        for (int i = 0; i < misVehiculos.length; i++) {
            System.out.println(misVehiculos[i].mostrarDatos() + "\n");
        }
    }
}
