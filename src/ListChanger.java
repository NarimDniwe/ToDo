import java.util.ArrayList;

public class ListChanger {
        public ArrayList<ToDo> bd = new ArrayList<>();

    public ArrayList<ToDo> getBd() {
        return bd;
    }

    public static void taskAdd (ArrayList<ToDo> bd, String title, String description, int index){
        ToDo task = new ToDo(title, description);
        bd.add(index, task);
    }
    public static void taskRemove (ArrayList<ToDo> bd, int index){
        bd.remove(index);
    }
    public static void taskEdit (ArrayList<ToDo> bd, int index, String title, String description){
        ToDo editedTask = new ToDo(title, description);
        bd.set(index, editedTask);
    }
    public static void taskView (ArrayList<ToDo> bd, int index){
        ToDo task = bd.get(index);
        task.print();
    }
    public static void taskEvery (ArrayList<ToDo> bd){
        for (int i = 0; i < bd.size(); i++) {
            ToDo task = bd.get(i);
            task.print();
            System.out.println(" * * * * * ");
        }
    }
}


