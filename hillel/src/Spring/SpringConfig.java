package Spring;

import Spring.Medieval.DamselRescueQuest;
import Spring.Medieval.DamselRescuingKnight;
import Spring.Medieval.DragonSlayQuest;
import Spring.SoundSystem.CD;
import Spring.SoundSystem.CdPlayer;
import Spring.SoundSystem.YellowSubmarineCd;
import org.springframework.context.annotation.*;

/**
 * Created by OGlovatskaya on 28.12.2015.
 */
@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public DamselRescuingKnight knight(){
        DamselRescuingKnight knight = new DamselRescuingKnight();
        return knight;
    }

    @Bean
    public DamselRescueQuest quest(){
        return new DamselRescueQuest();
    }

    @Bean
    @Primary
    public DragonSlayQuest dragonSlayQuest(){
        return new DragonSlayQuest();
    }

    /*@Bean
    YellowSubmarineCd yellowSubmarineCd(){
        return new YellowSubmarineCd();
    }

    @Bean
    CdPlayer cdPlayer(){
        return new CdPlayer(yellowSubmarineCd());
    }*/

}
