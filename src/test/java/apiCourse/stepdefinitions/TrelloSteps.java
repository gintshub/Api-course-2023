package apiCourse.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given; // can add * in Given place and it will import all steps
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrelloSteps {

    @Given("The board exists and contains the correct information")
    public void getBoardAndCheckInfo(){
        System.out.println("This is the first step");
    }

    @When("User changes the board title to {string}")
    public void changeBoardTitle(String title){
        System.out.println("Title was changed to: " + title);
    }

    @And("User check that the board name was updates to {string}")
    public void checkBoardTitle(String name){
        System.out.println("Board name was updated to: " + name);
    }

    @Then("User adds a list with title {string} to the board")
    public void addNewList(String name){
        System.out.println("A new list is created with name: " + name);
    }
}
