package TaskBuddy;

public class Task {
    // data members
    private int id;
    private String description;
    private String priority;

    // constructor
    public Task(int id, String description, String priority){
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    // methods

    public int getId( ) {
        return id;
    }
    public void setId( int id ) {
        this.id = id;
    }
    public String getDescription( ) {
        return description;
    }
    public void setDescription( String description ) {
        this.description = description;
    }
    public String getPriority( ) {
        return priority;
    }
    public void setPriority( String priority ) {
        this.priority = priority;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\tPriority: " + priority + "\t\tDescription: " + description ;
    }


}
