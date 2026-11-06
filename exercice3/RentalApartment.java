package exercice3;

public class RentalApartment extends Accommodation {
    private final double fixedCleaningPrice;

    public RentalApartment(String reference, double dailyRate, double fixedCleaningPrice) {
        super(reference, dailyRate);
        this.fixedCleaningPrice = fixedCleaningPrice;
    }

    @Override
    public double calculateStayPrice(int nbNight) {
        return nbNight * dailyRate + fixedCleaningPrice;
    }
}
