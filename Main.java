import java.util.Scanner;

import execice1.ArticleStock;
import exercice2.ConnectedDevice;
import exercice2.SecurityCamera;
import exercice2.Thermostat;
import main.Utils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quel exercice ?");
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
            choice = scanner.nextLine();
        } while (!Utils.isNumeric(choice));

        int execice = Integer.parseInt(choice);

        switch (execice) {
            case 1:
                ArticleStock item = new ArticleStock("Clavier mécanique");
                item.supply(15);

                Utils.print("Nous avons " + Integer.toString(item.getAmount()) + " claviers mécaniques");
                Utils.print("*Vente de 6 claviers* | " + item.ship(6));
                Utils.print("*Vente de 12 claviers* | " + item.ship(12));
                Utils.print("Nous avons " + Integer.toString(item.getAmount()) + " claviers mécaniques");
                break;

            case 2:
                ConnectedDevice device = new ConnectedDevice("Couloir");
                Thermostat thermostat = new Thermostat("Salon");
                SecurityCamera camera = new SecurityCamera("Entrée");

                Utils.print("*Diagnostique de l'appareil 1* | " + device.diagnose());
                Utils.print("*Diagnostique du thermostat* | " + thermostat.diagnose());
                Utils.print("*Diagnostique de la caméra 1* | " + camera.diagnose());

                Utils.print("*Mise en mode éco du thermostat* | " + thermostat.activateEcoMode());
                break;

            default:
                break;
        }

        scanner.close();
    }
}
