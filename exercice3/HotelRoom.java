package exercice3;

public class HotelRoom extends Accommodation {
    private final double breakfastSupplement;

    public HotelRoom(String reference, double dailyRate, double breakfastSupplement) {
        super(reference, dailyRate);
        this.breakfastSupplement = breakfastSupplement;
    }

    @Override
    public double calculateStayPrice(int nbNight) {
        return nbNight * (dailyRate + breakfastSupplement);
    }
}
