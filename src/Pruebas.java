package src;

import java.util.Scanner;

public class Pruebas {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {

      int saldo = 1000;
      System.out.println("Ingresa tu nombre");
      String nameUser = scan.nextLine();
      int retiro = 0;
      int deposito = 0;

      System.out.println("¿Qué quiéres hacer hoy? " + nameUser + " Retiro(R), Depósito(D), Consultar(C)");

      char option = scan.nextLine().toUpperCase().charAt(0);

      switch (option) {
        case 'R':

          System.out.println("Ingresa la cantidad de dinero que quieres");
          retiro = scan.nextInt();
          saldo -= retiro;

          if (retiro <= saldo) {
            System.out.println("Haz recibido " + retiro);
            System.out.println("Te queda " + saldo);
          } else {
            System.out.println("Eres pobre, no tienes esa cantidad de dinero");
          }

          break;

        case 'D':
          System.out.println("Ingresa cuánto dinero quiéres depositar");
          deposito = scan.nextInt();

          if (deposito > 0) {
            System.out.println("Tu saldo actual es " + saldo);
            saldo += deposito;
            System.out.println("Tu saldo actual con el depósito es " + saldo);
          } else {
            System.out.println("Estás pendejo");
          }
          break;

        case 'C':
          System.out.println("Tu saldo actual es: " + saldo);
          break;

        default:
          System.out.println("Error 404, cómprate una vida");
      }

    } catch (Exception e) {
      System.out.println("Haz  bien las cosas");
    }
  }
}
