package io.github.aomsweet.quarkus.extension.example.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusExtensionExampleProcessor {

    private static final String FEATURE = "quarkus-extension-example";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
