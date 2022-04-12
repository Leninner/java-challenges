import javax.swing.JOptionPane;

public class TravelTime {
  public static void main(String[] args) {
    float travelMinutes = 0;
    float userCurrentMinutes = 0;

    do {
      userCurrentMinutes = Float
          .parseFloat(JOptionPane.showInputDialog("Ingresa el tiempo que te llevó viajar cada viaje en minutos"));
      travelMinutes += userCurrentMinutes;
    } while (userCurrentMinutes != 0);

    JOptionPane.showMessageDialog(null,
        "El tiempo total usado en el viaje es: " + Math.round((travelMinutes / 60) * 100.0) / 100.0);
  }
}
