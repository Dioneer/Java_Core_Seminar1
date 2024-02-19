package Pegas.utils;

/**
 * class for decoration
 * @author Pegas
 */
public class Decorator {
    /**
     * decoration function
     * @param a - result for decoration
     * @return string for terminal
     */
    public static String decorate(int a){
        return String.format("Here if your: %d.", a);
    }
}
