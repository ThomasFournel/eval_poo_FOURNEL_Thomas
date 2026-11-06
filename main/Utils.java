package main;
public class Utils {
    /**
     * Checks whether a String is numeric (contains an int)
     */
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void print(String string) {System.out.println(string);}
    public static void print(Object obj) {System.out.println(obj.toString());}
}
