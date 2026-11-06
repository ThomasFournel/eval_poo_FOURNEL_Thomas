package exercice3;

public abstract class Accommodation {
    protected String reference;
    protected double dailyRate;

    protected Accommodation(String reference, double dailyRate) {
        this.reference = reference;
        this.dailyRate = dailyRate;
    }

    /**
     * Returns the price of the full stay
     * @param nbNight - The number of nights
     */
    public abstract double calculateStayPrice(int nbNight);

    public String describe() {
        return "Hébergement " + this.reference + " - Tarif de base : " + Double.toString(dailyRate) + " €/nuit";
    }

}
