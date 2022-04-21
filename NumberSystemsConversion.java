import javax.swing.JOptionPane;

public class NumberSystemsConversion {
  public static void main(String[] args) {
    int operation = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Conversión entre sistemas de numeración \nElige le mejor opción: \n1. Decimal a Binario \n2. Binario a Decimal \n3. Binario a hexadecimal \n4. Hexadecimal a Binario \n5. Decimal a Hexadecimal \n6. Hexadecimal a Decimal"));

    switch (operation) {
      case 1:
        int decimal = Integer.parseInt(JOptionPane.showInputDialog(
            "Ingresa el número decimal a convertir")), aux = decimal;
        String binario = "";

        while (aux > 0) {
          binario = (aux % 2) + binario;
          aux /= 2;
        }

        JOptionPane.showMessageDialog(null, "El número " + decimal + " en binario es " + binario);
        break;

      case 2:
        String binario2 = JOptionPane.showInputDialog(
            "Ingresa el número binario a convertir");
        int decimal2 = 0, aux2 = 1;

        for (int i = binario2.length() - 1; i >= 0; i--) {
          if (binario2.charAt(i) == '1') {
            decimal2 += aux2;
          }

          aux2 *= 2;
        }

        JOptionPane.showMessageDialog(null, "El número " + binario2 + " en decimal es " + decimal2);
        break;

      case 3:
        String binario3 = JOptionPane.showInputDialog(
            "Ingresa el número binario a convertir; debe ser de 16 caracteres entre 0 y 1");
        String hexadecimal = "";

        int i = 3;
        int auxX = 0;

        for (int j = 0; j < binario3.length(); j++) {
          auxX += (int) (Integer.parseInt(String.valueOf(binario3.charAt(j)))
              * Math.round(Math.pow(2, i)));

          i--;

          if (i == -1) {
            switch (auxX) {
              case 10:
                hexadecimal += "A";
                break;
              case 11:
                hexadecimal += "B";
                break;
              case 12:
                hexadecimal += "C";
                break;
              case 13:
                hexadecimal += "D";
                break;
              case 14:
                hexadecimal += "E";
                break;
              case 15:
                hexadecimal += "F";
                break;
              default:
                hexadecimal += auxX;
                break;
            }

            i = 3;
            auxX = 0;
          }
        }

        JOptionPane.showMessageDialog(null, "El número " + binario3 + " en hexadecimal es " + hexadecimal);
        break;

      case 4:
        String hexadecimal4 = JOptionPane.showInputDialog(
            "Ingresa el número hexadecimal a convertir");
        String binario4 = "";

        for (int k = 0; k < hexadecimal4.length(); k++) {
          switch (hexadecimal4.charAt(k)) {
            case '0':
              binario4 += "0000";
              break;
            case '1':
              binario4 += "0001";
              break;
            case '2':
              binario4 += "0010";
              break;
            case '3':
              binario4 += "0011";
              break;
            case '4':
              binario4 += "0100";
              break;
            case '5':
              binario4 += "0101";
              break;
            case '6':
              binario4 += "0110";
              break;
            case '7':
              binario4 += "0111";
              break;
            case '8':
              binario4 += "1000";
              break;
            case '9':
              binario4 += "1001";
              break;
            case 'A':
              binario4 += "1010";
              break;
            case 'B':
              binario4 += "1011";
              break;
            case 'C':
              binario4 += "1100";
              break;
            case 'D':
              binario4 += "1101";
              break;
            case 'E':
              binario4 += "1110";
              break;
            case 'F':
              binario4 += "1111";
              break;
            default:
          }
        }

        JOptionPane.showMessageDialog(null, "El número " + hexadecimal4 + " en binario es " + binario4);

        break;

      case 5:
        int decimal5 = Integer.parseInt(JOptionPane.showInputDialog(
            "Ingresa el número decimal a convertir")), aux5 = decimal5, auxR = 0;
        String hexadecimal5 = "";

        while (aux5 >= 1) {
          auxR = aux5 % 16;

          switch (auxR) {
            case 10:
              hexadecimal5 = "A" + hexadecimal5;
              break;
            case 11:
              hexadecimal5 = "B" + hexadecimal5;
              break;
            case 12:
              hexadecimal5 = "C" + hexadecimal5;
              break;
            case 13:
              hexadecimal5 = "D" + hexadecimal5;
              break;
            case 14:
              hexadecimal5 = "E" + hexadecimal5;
              break;
            case 15:
              hexadecimal5 = "F" + hexadecimal5;
              break;
            default:
              hexadecimal5 = auxR + hexadecimal5;
              break;
          }

          aux5 /= 16;
        }

        JOptionPane.showMessageDialog(null, "El número " + decimal5 + " en hexadecimal es " + hexadecimal5);

        break;

      case 6:
        String hexadecimal6 = JOptionPane.showInputDialog(
            "Ingresa el número hexadecimal a convertir");
        int decimal6 = 0, aux6 = 0;

        for (int k = hexadecimal6.length() - 1; k >= 0; k--) {
          switch (hexadecimal6.charAt(k)) {
            case '0':
              decimal6 += 0 * Math.round(Math.pow(16, aux6));
              break;
            case '1':
              decimal6 += 1 * Math.round(Math.pow(16, aux6));
              break;
            case '2':
              decimal6 += 2 * Math.round(Math.pow(16, aux6));
              break;
            case '3':
              decimal6 += 3 * Math.round(Math.pow(16, aux6));
              break;
            case '4':
              decimal6 += 4 * Math.round(Math.pow(16, aux6));
              break;
            case '5':
              decimal6 += 5 * Math.round(Math.pow(16, aux6));
              break;
            case '6':
              decimal6 += 6 * Math.round(Math.pow(16, aux6));
              break;
            case '7':
              decimal6 += 7 * Math.round(Math.pow(16, aux6));
              break;
            case '8':
              decimal6 += 8 * Math.round(Math.pow(16, aux6));
              break;
            case '9':
              decimal6 += 9 * Math.round(Math.pow(16, aux6));
              break;
            case 'A':
              decimal6 += 10 * Math.round(Math.pow(16, aux6));
              break;
            case 'B':
              decimal6 += 11 * Math.round(Math.pow(16, aux6));
              break;
            case 'C':
              decimal6 += 12 * Math.round(Math.pow(16, aux6));
              break;
            case 'D':
              decimal6 += 13 * Math.round(Math.pow(16, aux6));
              break;
            case 'E':
              decimal6 += 14 * Math.round(Math.pow(16, aux6));
              break;
            case 'F':
              decimal6 += 15 * Math.round(Math.pow(16, aux6));
              break;
            default:
          }

          aux6++;
        }

        JOptionPane.showMessageDialog(null, "El número " + hexadecimal6 + " en decimal es " + decimal6);

        break;

    }
  }
}
