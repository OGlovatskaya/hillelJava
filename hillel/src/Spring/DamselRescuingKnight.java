package Spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by OGlovatskaya on 28.12.2015.
 */
public class DamselRescuingKnight {
    private Quest quest;

    @Autowired
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarkQuest(){
        quest.embark();
    }
}
