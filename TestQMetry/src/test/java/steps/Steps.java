package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Steps {

    @Given("es wurde ein Test ausgeführt")
    public void es_wurde_ein_test_ausgeführt() throws IOException {
        final byte[] screenshot = Files.readAllBytes(new File("/Users/ap7c0/Downloads/Unknown.jpg").toPath());
        ScenarioManager.getScenario().attach(screenshot, "image/jpg", "Failed Scenario Screenshot");
        // Write code here that turns the phrase above into concrete actions

    }
    @When("das Ergebnis hochgeladen wird")
    public void das_ergebnis_hochgeladen_wird() {
        ArrayList<String> test = new ArrayList<>();
        ScenarioManager.getScenario().attach("Das ist ein Test","Text/txt", "TestText");
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("sind die Anlagen verfügbar")
    public void sind_die_anlagen_verfügbar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
