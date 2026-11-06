package exercice5;

public class EventJournal {
    private static EventJournal instance;
    private String alertLevel;

    private EventJournal() {}

    public static EventJournal getInstance() {
        if (instance == null) instance = new EventJournal();
        return instance;
    }

    public String getAlertLevel() {return alertLevel;}
    public void setAlertLevel(String alertLevel) {this.alertLevel = alertLevel;}
}
