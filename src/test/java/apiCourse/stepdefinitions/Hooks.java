package apiCourse.stepdefinitions;
import apiCourse.helpers.TestCaseContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import static apiCourse.clients.TrelloClient.changeBoardName;
import static apiCourse.clients.TrelloClient.deleteList;
import static apiCourse.constants.ProjectConstants.BOARD_NAME;

public class Hooks {

    @Before
    public void beforeHook(Scenario scenario){
        TestCaseContext.init();
        TestCaseContext.setScenario(scenario);
        System.out.println("Scenario has started");
    }

    @After
    public void afterHook(){
        changeBoardName(BOARD_NAME, TestCaseContext.getBoard().getId());
        deleteList(TestCaseContext.getList().getId());
        System.out.println("Scenario has ended");
    }
}
