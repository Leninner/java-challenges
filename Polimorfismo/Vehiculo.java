package Polimorfismo;

public class Vehiculo {
    protected String marca;
    protected String matricula;
    protected String modelo;

    public Vehiculo(String marca, String matricula, String modelo){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {
        return "Marca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo;
    }
}
