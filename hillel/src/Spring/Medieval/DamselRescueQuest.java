package Spring.Medieval;


/**
 * Created by OGlovatskaya on 28.12.2015.
 */
public class DamselRescueQuest implements Quest{

    @Override
    public void embark(){
        System.out.println("Damsel rescuing quest embarked!");
    }

    @Override
    public String toString() {
        return "DamselRescueQuest{}";
    }
}
