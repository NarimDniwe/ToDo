public class ToDo{
     String title;
    String description;
     int taskLevel;
    ToDo(String title, String description , int taskLevel){
        this.title = title;
        this.description = description;
        this.taskLevel = taskLevel;
    }
    void print(){
        System.out.println(title + "\n" + description);
    }
}

