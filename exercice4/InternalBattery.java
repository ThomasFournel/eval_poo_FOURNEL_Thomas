package exercice4;

public class InternalBattery {
    private int mahCapacity;

    protected InternalBattery(int mahCapacity) {
        this.mahCapacity = mahCapacity;
    }

    public int getMahCapacity() {
        return mahCapacity;
    }
}
