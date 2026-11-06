package exercice2;

public class SecurityCamera extends ConnectedDevice{
    public SecurityCamera(String room) {
        super(room);
    }

    @Override
    public String diagnose() {
        return "Le caméra de "+ this.room +" filme en haute définition.";
    }
}
