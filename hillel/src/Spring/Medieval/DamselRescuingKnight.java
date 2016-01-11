package Spring.Medieval;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by OGlovatskaya on 28.12.2015.
 */
public class DamselRescuingKnight {

    private Quest quest;

    @Autowired
    //@Qualifier("quest")
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarkQuest(){
        quest.embark();
    }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("deprecated method called");
    }

}
