package controller;

/**
 * Created by Potat on 3/23/2017.
 */
public class ptat {
    private static ptat ourInstance = new ptat();

    public static ptat getInstance() {
        return ourInstance;
    }

    private ptat() {
    }
}
