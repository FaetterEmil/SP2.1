public abstract class AFuelCar extends ACar {
    int kmPerLitre;


    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPerLitre = kmPerLitre;
    }


    public abstract String getFuelType();


    public int kmPrLitre() {
        return kmPerLitre;
    }
}