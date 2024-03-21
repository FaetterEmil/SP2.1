import java.util.ArrayList;


import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> cars;


    public FleetOfCars() {
        cars = new ArrayList<>();
    }


    public void addCar(Car car) {
        cars.add(car);
    }
    public ArrayList<Car> getCars() {
        return cars;
    }


    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : cars) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Car car : cars) {
            builder.append(car.toString()).append("\n");
        }
        return builder.toString();
    }
}
