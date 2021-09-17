package tests;

import Pages.HomePage;
import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.testng.annotations.Test;


import java.util.Collections;

public class storyRunner extends ConfigurableEmbedder {

    public Embedder embedder;
    @Override
    @Test
    public void run() {
        embedder = configuredEmbedder();
        embedder.configuration();
        String storyPah = "searchForProductTest.story";
        embedder.runStoriesAsPaths(Collections.singletonList(storyPah));
    }

    public Configuration configuration(){
        return new MostUsefulConfiguration();
    }

    public InjectableStepsFactory stepsFactory(){
        return new InstanceStepsFactory(configuration(), HomePage.class);
    }
}
