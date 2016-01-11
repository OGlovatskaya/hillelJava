package Spring.SoundSystem;

import org.springframework.stereotype.Component;

/**
 * Created by OGlovatskaya on 11.01.2016.
 */
@Component
public class YellowSubmarineCd implements CD {

    @Override
    public void play() {
        System.out.println("We all live in yellow submarine...");
    }
}
