
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListChanger list = new ListChanger();
        ArrayList<ToDo> bd = list.getBd();
        ListChanger.taskAdd(bd, "First", "My description", 0);
        ListChanger.taskAdd(bd, "Second", "My1111 description", 1);
        ListChanger.taskAdd(bd, "Third", "My1111 description", 2);
        ListChanger.taskEvery(bd);

    }
}