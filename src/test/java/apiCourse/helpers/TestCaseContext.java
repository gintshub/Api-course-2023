package apiCourse.helpers;

import apiCourse.domain.Board;
import apiCourse.domain.List;
import io.cucumber.java.Scenario;

public class TestCaseContext {

    private static Board board;

    private static List list;

    private static Scenario scenario;

    public static void init(){
        board = null;
        list = null;
    }

    public static Board getBoard() {
        return board;
    }

    public static void setBoard(Board board) {
        TestCaseContext.board = board;
    }

    public static List getList() {
        return list;
    }

    public static void setList(List list) {
        TestCaseContext.list = list;
    }

    public static Scenario getScenario() {
        return scenario;
    }

    public static void setScenario(Scenario scenario) {
        TestCaseContext.scenario = scenario;
    }
}
