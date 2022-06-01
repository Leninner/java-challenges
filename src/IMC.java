package src;

import java.util.Scanner;

public class IMC {

  public static void main(String[] args) {
    double peso;
    double altura;
    double IMC;

    String patientName;
    Scanner scan = new Scanner(System.in);

    // Encabezado
    System.out.printf("%50S\n" + "%55s\n", "Universidad Tecnica de Ambato",
        "Facultad de Ingenieria en Sistemas");
    // El autor
    System.out.printf("%40s\n\n", "Elaborado por : Anita M.");
    System.out.printf("%40s\n", "*****");
    System.out.printf("%40s\n", "Calculo de Indice de Masa Corporal");
    System.out.printf("%40s\n", "*****");

    System.out.printf("%40s\n", "*****");

    System.out.printf("%40s\n", "Ingrese el nombre del paciente: ");
    patientName = scan.nextLine();
    System.out.printf("%25s%s", "", "Ingrese el valor del peso(en kg): ");
    peso = scan.nextDouble();
    System.out.printf("%25s%s", "", "Ingrese el valor de la altura (en mts): ");
    altura = scan.nextDouble();

    IMC = Math.round((peso / Math.pow(altura, 2)) * 100.0) / 100.0;

    System.out.printf("El indice de masa corporal es de: " + IMC);

    if (IMC < 16) {
      System.out.printf("%25s%s", "", "Criterio de Ingreso en el Hospital");
    } else if (IMC >= 16 && IMC <= 17) {
      System.out.printf("%25s%s", "", "Criterio de Infrapreso");
    } else if (IMC >= 17 && IMC <= 18) {
      System.out.printf("%25s%s", "", "Bajo peso xd");
    } else if (IMC >= 18 && IMC <= 25) {
      System.out.printf("%25s%s", "", "Peso Normal uwu");
    } else if (IMC >= 25 && IMC <= 30) {
      System.out.printf("%25s%s", "", "Sobrepeso (obesidad de grado I)");
    } else if (IMC >= 30 && IMC <= 35) {
      System.out.printf("%25s%s", "", "Sobre peso cronico(obesidad del grado II)");
    } else if (IMC >= 35 && IMC <= 40) {
      System.out.printf("%25s%s", "", "Obesidad premorbida(obesidad del grado III)");
    } else if (IMC > 40) {
      System.out.printf("%25s%s", "", "Obesidad morbida(obesidad de grado IV)");
    }

  }
}