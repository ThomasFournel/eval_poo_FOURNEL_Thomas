package exercice2;

public class ConnectedDevice {
    protected final String room;

    public ConnectedDevice(String room) {
        this.room = room;
    }

    public String diagnose() {
        return "L'appareil situé dans "+ this.room + " fonctionne normalement.";
    }
}
