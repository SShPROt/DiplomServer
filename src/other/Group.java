package other;

public class Group {
    private String name;
    private int id;

    public Group(String name, int id){
        this.name = name;
        this.id = id;
    }
    public Group(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
