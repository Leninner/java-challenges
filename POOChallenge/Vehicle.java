package POOChallenge;

public class Vehicle {
    private String vehicleBrand;
    private String vehicleModel;
    private double vehiclePrice;

    public Vehicle(String vehicleBrand, String vehicleModel, double vehiclePrice) {
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.vehiclePrice = vehiclePrice;
    }

    public Double getVehiclePrice() {
        return vehiclePrice;
    }

    public String showVehicleInfo() {
        return "Vehicle brand: " + vehicleBrand + "\nVehicle model: " + vehicleModel + "\nVehicle price: " + vehiclePrice;
    }
}
