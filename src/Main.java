
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListChanger list = new ListChanger();
        ArrayList<ToDo> bd = list.getBd();
        ListChanger.taskAdd(bd, "First", "My description1", "High");
        ListChanger.taskAdd(bd, "Second", "My1111 2", "Low");
        ListChanger.taskAdd(bd, "Third", "My1111 description3", "high");
        ListChanger.taskAdd(bd, "Fourth", "My1111 description4", "low");
        ListChanger.taskEvery(bd);

    }
}