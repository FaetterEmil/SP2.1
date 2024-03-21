public class ElectricCar extends ACar {
    private int batteryCapacityKWh; // Attribute for battery capacity
    private int maxRangeKm; // Attribute for maximum range
    private int whPrKm; // Attribute for power consumption


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm, int whPrKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
        this.whPrKm = whPrKm;
    }


    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }


    public int getMaxRangeKm() {
        return maxRangeKm;
    }


    public int getWhPrKm() {
        return whPrKm;
    }


    public int getRegistrationFee() {

        double kmPerKWh = 100 / (double)whPrKm;

        if (kmPerKWh >= 20) {
            return 330;
        } else if (kmPerKWh >= 15) {
            return 1050;
        } else if (kmPerKWh >= 10) {
            return 2340;
        } else if (kmPerKWh >= 5) {
            return 5500;
        } else {
            return 10470;
        }
    }
}


