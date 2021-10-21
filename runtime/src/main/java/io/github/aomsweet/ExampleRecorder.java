package io.github.aomsweet;

import io.github.aomsweet.conf.ExampleConfiguration;
import io.quarkus.runtime.annotations.Recorder;

import java.util.function.Supplier;

/**
 * @author aomsweet
 */
@Recorder
public class ExampleRecorder {

    Supplier<Object> example(ExampleConfiguration configuration) {
        String agentName = configuration.getAgentName();
        System.out.println(agentName);
        return Object::new;
    }
}
