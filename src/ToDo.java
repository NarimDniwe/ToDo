public class ToDo{
     String title;
    String description;
    ToDo(String title, String description){
        this.title = title;
        this.description = description;
    }
    void print(){
        System.out.println(title + "\n" + description);
    }
}

