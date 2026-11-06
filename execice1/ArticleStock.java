package execice1;

public class ArticleStock {
    private final String name;
    private int amount;

    public ArticleStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public ArticleStock(String name) {
        this.name = name;
        this.amount = 0;
    }

    /**
     * Adds the given amount to the stock
     */
    public void supply(int nb) {
        if (nb <= 0) throw(new IllegalArgumentException("La quantité donnée doit être positive"));
        amount += nb;
    }

    /**
     * Substracts the given amount to the stock, then prints how many itmes are left
     */
    public String ship(int nb) {
        if (nb <= 0) return " Erreur : la quantité donnée doit être positive";
        if (nb > amount) return "Erreur : stock insuffisant pour expédier " + Integer.toString(nb) + " unités.";
        amount -= nb;
        return "Expédition de " + Integer.toString(nb) + " unités validée.";
    }

    // Getters
    public String getName() {return name;}
    public int getAmount() {return amount;}
}
