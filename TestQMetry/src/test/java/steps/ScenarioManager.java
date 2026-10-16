package steps;

import io.cucumber.java.Scenario;

public class ScenarioManager {
    private static Scenario scenario = null;

    public ScenarioManager() {
    }

    public static void initScenario(Scenario s) {
        scenario = s;
    }
    public static Scenario getScenario() {
        return scenario;
    }
}
