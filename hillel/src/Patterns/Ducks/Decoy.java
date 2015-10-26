package Patterns.Ducks;

/**
 * Created by OGlovatskaya on 26.10.2015.
 */
public class Decoy extends Duck {

    @Override
    public String fly(){
        return "fly no way :(";
    }

    @Override
    String display() {
        return "Decoy";
    }
}
