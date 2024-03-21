public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;


    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
        this.hasParticleFilter = hasParticleFilter;
    }


    public String getFuelType() {
        return "Diesel";
    }


    public int getRegistrationFee() {
        int registrationFee = 0;
        int kmPerLitre = kmPrLitre();

        if (kmPerLitre >= 20 && kmPerLitre <= 50) {
            registrationFee += 130;
        } else if (kmPerLitre >= 15 && kmPerLitre < 20) {
            registrationFee += 1390;
        } else if (kmPerLitre >= 10 && kmPerLitre < 15) {
            registrationFee += 1850;
        } else if (kmPerLitre >= 5 && kmPerLitre < 10) {
            registrationFee += 2770;
        } else {
            registrationFee += 15260;
        }

        if (!hasParticleFilter) {
            registrationFee += 1000;
        }
        return registrationFee;
    }
}