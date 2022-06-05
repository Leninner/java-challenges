package POOChallenge;

public class Atletismo {
    // Construir un programa para una competencia de atletismo,
    // el programa debe gestionar una serie de atletas caracterizados
    // por su número de atleta, nombre y tiempo de carrera, al final
    // el programa debe mostrar los datos del atleta ganador de la carrera.
    private int numberAtleta;
    private String nameAtleta;
    private double timeAtleta;

    public Atletismo(int numberAtleta, String nameAtleta, double timeAtleta) {
        this.numberAtleta = numberAtleta;
        this.nameAtleta = nameAtleta;
        this.timeAtleta = timeAtleta;
    }

    public double getTimeAtleta() {
        return timeAtleta;
    }

    public String getAtletaInfo() {
        return "Atleta: " + numberAtleta + " | " + nameAtleta + " | " + timeAtleta;
    }
}
