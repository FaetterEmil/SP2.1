public  class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
    }


    public String getFuelType() {
        return "Gasoline";
    }

    public int kmPerLitre() {
        return kmPerLitre;
    }


    public int getRegistrationFee() {
        int kmPerLitre = kmPerLitre();
        if (kmPerLitre >= 20 && kmPerLitre <= 50) {
            return 330;
        } else if (kmPerLitre >= 15 && kmPerLitre < 20) {
            return 1050;
        } else if (kmPerLitre >= 10 && kmPerLitre < 15) {
            return 2340;
        } else if (kmPerLitre >= 5 && kmPerLitre < 10) {
            return 5500;
        } else {
            return 10470;
        }
    }
}
