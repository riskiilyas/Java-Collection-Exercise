import java.util.ArrayList;

public class StudentList extends ArrayList<String> {
    public void addStudent(String name) {
        this.add(name);
    }

    public void removeStudent(String name) {
        this.remove(name);
    }

    public void changeStudent(String oldName, String newName) {
        int index = this.indexOf(oldName);
        this.set(index, newName);
    }

    public void printStudents() {
        for (String name : this) {
            System.out.println(name);
        }
    }
}