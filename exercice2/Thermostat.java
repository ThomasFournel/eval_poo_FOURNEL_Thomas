package exercice2;

public class Thermostat extends ConnectedDevice{
    public Thermostat(String room) {
        super(room);
    }

    @Override
    public String diagnose() {
        return "Le thermostat de "+ this.room +" régule la température à 20°C.";
    }

    public String activateEcoMode() {
        return "Le thermostat de " + this.room + " passe en mode économique.";
    }
}
