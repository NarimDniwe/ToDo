import java.util.ArrayList;

public class ListChanger {
        public ArrayList<ToDo> bd = new ArrayList<>();

    public ArrayList<ToDo> getBd() {
        return bd;
    }

    public static void taskAdd (ArrayList<ToDo> bd, String title, String description, String priority){
        int taskLevel;
        String priorityLowerCase = priority.toLowerCase();
        if (priorityLowerCase.equals("high"))
            taskLevel = 0;
        else if (priorityLowerCase.equals("low"))
            taskLevel = 1;
        else throw new IllegalArgumentException("Priority can be only High or Low.");
        ToDo task = new ToDo(title, description, taskLevel);
        bd.add(taskLevel, task);
    }
    public static void taskRemove (ArrayList<ToDo> bd, int index){
        bd.remove(index);
    }
    public static void taskEdit (ArrayList<ToDo> bd, int index, String title, String description, int taskLevel){
        ToDo editedTask = new ToDo(title, description, taskLevel);
        bd.set(index, editedTask);
    }
    public static void taskView (ArrayList<ToDo> bd, int index){
        ToDo task = bd.get(index);
        task.print();
    }
    private void taskLevel () {

    }
    public static void taskEvery (ArrayList<ToDo> bd){
        for (int i = 0; i < bd.size(); i++) {
            ToDo task = bd.get(i);
            task.print();
            System.out.println(" * * * * * ");
        }
    }
}


