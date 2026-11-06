package exercice4;

// Lorsque le Smartphone se créé, il créé la batterie avec lui.
// Le constructeur de la batterie serait en protected, comme ça, seul Smartphone peut créer une instance de InternalBattery.
// Alors "la batterie appartient exclusivement à ce smartphone et ne peut pas exister indépendamment de lui" s'éxplique par "La batterie ne peut pas exister indépendamment d'un Smartphone car elle ne peut pas être créée en dehors d'un Smartphone"

public class Smartphone {
    private InternalBattery battery;
    private String model;

    public Smartphone(String model, int batteryCapacity) {
        this.model = model;
        this.battery = new InternalBattery(batteryCapacity);
    }

    public String getTechnicalSheet() {
        return "Smartphone " + this.model + " équipé d'une batterie scellée de " + this.battery.getMahCapacity() + "mAh.";
    }
}
