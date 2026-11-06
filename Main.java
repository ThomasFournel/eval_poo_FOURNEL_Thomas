import java.util.Scanner;

import execice1.ArticleStock;
import main.Utils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quel exercice ?");
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {
            choice = scanner.nextLine();
        } while (!Utils.isNumeric(choice));

        if (choice.equals("1")) {
            // exo 1
            ArticleStock item = new ArticleStock("Clavier mécanique");
            item.supply(15);
            Utils.print("Nous avons " + Integer.toString(item.getAmount()) + " claviers mécaniques");
            Utils.print("*Vente de 6 claviers* | " + item.ship(6));
            Utils.print("*Vente de 12 claviers* | " + item.ship(12));
            Utils.print("Nous avons " + Integer.toString(item.getAmount()) + " claviers mécaniques");
        }

        scanner.close();
    }
}
