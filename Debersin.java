import java.util.Scanner;

public class Debersin {
  Scanner scan = new Scanner(System.in);

  /**
   * @description: Función que permite ingresar a un comerciante el costo de
   *               compra de un
   *               artículo y que determina el precio al cual debe venderlo si
   *               desea ganar el 15%.
   * @return {String} El mensaje que con el precio final del producto.
   */

  String getFinalPrice() {
    System.out.println("**** Bienvenido Triple 7, esta es tu tienda de comercio electrónico ****");
    System.out.println(
        "Para empezar, ingresa el precio de tu producto y yo te diré cuánto debe ser tu precio final si quiéres ganar el 15%");
    System.out.print("-> ");

    float precio = scan.nextFloat();

    return "El precio final de tu producto es: " + Math.round((precio * 1.15) * 100.0) / 100.0 + "\n";
  }

  /**
   * @description: Función que lee el valor correspondiente a una distancia en
   *               millas
   *               marinas y las
   *               escriba expresadas en metros. Sabiendo que 1 milla marina
   *               equivale a 1852 metros.
   * @return {String} El mensaje que con la distancia en metros.
   */

  String getMetersFromMaritimeMiles() {
    System.out.println("**** Bienvenido a la conversión de millas marinas a metros ****");
    System.out.println("Ingresa la distancia en millas maritimas");
    System.out.print("-> ");

    float maritimeMiles = scan.nextFloat();

    return "La distancia en metros es: " + (maritimeMiles * 1852) + "\n";
  }

  /**
   * @description: Función que pide al usuario el radio de una esfera y muestra
   *               por pantalla
   *               el
   *               volumen de la esfera
   * @return {String} El mensaje que con el volumen de la esfera.
   */

  String getSphereVolume() {
    System.out.println("**** Bienvenido a la función que calcula el volumen de una bola ****");
    System.out.println("Ingresa el radio de la esfera");
    System.out.print("-> ");

    float sphereRadius = scan.nextFloat();

    return "El volumen es: " + Math.round(((4 * Math.PI * Math.pow(sphereRadius, 3)) / 3) * 100.0) / 100.0 + "\n";
  }

  /**
   * @description: Función que expresa en horas, minutos y segundos un tiempo
   *               expresado en
   *               segundos.
   * @return {String} El mensaje que con el tiempo expresado en horas, minutos y
   *         segundos
   */

  String getHoursMinutesAndSeconds() {
    System.out.println("**** Bienvenido a la función que calcula las horas, minutos y segundos ****");
    System.out.println("Ingresa la cantidad de segundos");
    System.out.print("-> ");

    float seconds = scan.nextFloat();

    int hours = (int) seconds / 3600;
    int minutes = (int) (seconds % 3600) / 60;
    int secondsLeft = (int) (seconds % 3600) % 60;

    return "La cantidad de horas es: " + hours + "\n" + "La cantidad de minutos es: " + minutes + "\n"
        + "La cantidad de segundos es: " + secondsLeft + "\n";
  }

  /**
   * @description: Función que muestra el resultado de una historia
   * @return {String} El mensaje que con el resultado final de la historia.
   */

  String getACoolHistory() {
    int juan = 3, maria = 5, adan = 6, totalManzanas = juan + maria + adan, auxJuan = juan, auxMaria = maria,
        auxAdan = adan;

    System.out.println("**** Bienvenido a la historia de una mujer ****");
    System.out.println("Juan tiene " + juan + " manzanas\n" + "Maria tiene " + maria + " manzanas\n" + "Adan tiene "
        + adan + " manzanas\n");
    System.out.println("Total de manzanas: " + totalManzanas + "\n");

    System.out.println(
        "Si se desea que cada persona tenga el mismo número de manzanas, se debe restar 2 manzanas al total y dividirlas entre las 3 personas");
    System.out
        .println("-> Total de manzanas que tendrá cada uno: " + (totalManzanas - 2) / 3 + "\nSobrante de manzanas: "
            + totalManzanas % 3 + "\n");

    for (int i = 1; i <= 7; i++) {
      juan--;
      maria--;
      adan--;

      if (i < 6) {
        juan += auxJuan;
        maria += auxMaria;
        adan += auxAdan;
      }

      if (i == 7) {
        juan--;
        maria--;
        adan--;
      }
    }

    return "El número de manzanas que tiene cada uno después de una semana en el caso  planteado es: \nJuan: " + juan
        + "\nMaria: " + maria
        + "\nAdan: " + adan
        + "\n";
  }

  /**
   * @description: Función que muestra el promedio de las 3 notas de un estudiante
   *               y comprueba si aprobó o no
   * @return {String} El mensaje que con el promedio de las 3 notas y si aprobó o
   *         no
   */

  String getFinalPromedio() {
    System.out.println("**** Bienvenido a la función que calcula el promedio de un estudiante ****");

    float promedio = 0;

    for (int i = 0; i < 3; i++) {
      System.out.println("Ingresa la nota " + (i + 1) + " de la materia");
      System.out.print("-> ");

      promedio += scan.nextFloat();
    }

    return Math.round((promedio / 3) * 100.0) / 100.0 > 7
        ? "Felicidades, has aprobado la materia con " + Math.round((promedio / 3) * 100.0) / 100.0 + " puntos\n"
        : "Lo sentimos, has reprobado la materia con " + Math.round((promedio / 3) * 100.0) / 100.0 + " puntos\n";
  }

  /**
   * @description: Función que muestra si una persona ganó un premio o no
   * @return {String} El mensaje que con el resultado final del sorteo
   */

  String getAward() {
    System.out.println("**** Bienvenido al lugar donde los sueños se hacen realidad ****");
    System.out.println("Ingresa el número para probar suerte");
    System.out.print("-> ");

    int number = scan.nextInt();

    return number % 2 == 0 && (number >= 1 && number <= 1000) ? "Felicidades, has ganado un premio\n"
        : "Lo sentimos, no has ganado un premio\n";
  }

  /**
   * @description: Función que muestra el valor absoluto de un número
   * @return {String} El mensaje con el valor absoluto del número
   */

  String getAbsoluteValue() {
    System.out.println("**** Bienvenido a la función que calcula el valor absoluto de un número ****");
    System.out.println("Ingresa el número");
    System.out.print("-> ");

    int number = scan.nextInt();

    return number < 0 ? "El valor absoluto es: " + Math.abs(number) + "\n"
        : "El valor absoluto es: " + number + "\n";
  }

  /**
   * @description: Función que muestra si existe coincidencia en la primera letra
   *               o en la última letra de dos nombres
   * @return {String} El mensaje con el resultado final de la función
   */

  String getCoincidence() {
    System.out.println("**** Bienvenido a la función que calcula la coincidencia entre 2 nombres ****");

    System.out.println("Ingresa el primer nombre");
    System.out.print("-> ");
    String firstPerson = scan.next();

    System.out.println("Ingresa el segundo nombre");
    System.out.print("-> ");
    String secondPerson = scan.next();

    if (firstPerson.charAt(0) == secondPerson.charAt(0) || firstPerson.charAt(firstPerson.length() - 1) == secondPerson
        .charAt(secondPerson.length() - 1)) {
      return "Coinciencia: " + firstPerson + " y " + secondPerson + "\n";
    } else {
      return "No hay coincidencia\n";
    }
  }

  /**
   * @description: Función que muestra si un año es bisiesto o no
   * @return {String} El mensaje con el resultado final de la función
   */
  String isALeapYear() {
    System.out.println("**** Bienvenido a la función que calcula si un año es bisiesto o no ****");
    System.out.println("Ingresa el año");
    System.out.print("-> ");

    int year = scan.nextInt();

    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "El año " + year + " es bisiesto\n"
        : "El año " + year + " no es bisiesto\n";
  }

  public static void main(String[] args) {
    System.out.println(new Debersin().getFinalPrice());
    System.out.println(new Debersin().getMetersFromMaritimeMiles());
    System.out.println(new Debersin().getSphereVolume());
    System.out.println(new Debersin().getHoursMinutesAndSeconds());
    System.out.println(new Debersin().getACoolHistory());
    System.out.println(new Debersin().getFinalPromedio());
    System.out.println(new Debersin().getAward());
    System.out.println(new Debersin().getAbsoluteValue());
    System.out.println(new Debersin().getCoincidence());
    System.out.println(new Debersin().isALeapYear());
  }
}