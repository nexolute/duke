public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toSaveString() {
        String isDone = this.isDone ? "1" : "0";
        return "T | " +  isDone + " | " + this.description;
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
