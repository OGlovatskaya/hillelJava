package OOP;

import OOP.OOP;

/**
 * Created by OGlovatskaya on 05.10.2015.
 */
public class Caller {
    public static void main(String[] args){
        OOP.printString();
        OOP.sharedString = "yahoo!";
        OOP.printString();
    }
}
