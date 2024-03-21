public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();


        GasolineCar car1 = new GasolineCar("ABC123", "Audi", "A6", 3, 15);
        DieselCar car2 = new DieselCar("DEF456", "BMW", "X5", 5, 15, true);
        ElectricCar car3 = new ElectricCar("GHI789", "Tesla", "Model X", 4, 100, 400, 5);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);


        System.out.println("Cars in the fleet:");
        for (Car car : fleet.getCars()) {
            System.out.println(car.getMake() + " " + car.getModel() + " - " + car.getRegistrationNumber());
        }


        System.out.println("Den totale registreringsafgift er: " + fleet.getTotalRegistrationFeeForFleet() + " kr");
    }
}