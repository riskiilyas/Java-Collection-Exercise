import java.util.HashSet;

public class PersonIDSet extends HashSet<String> {
    public void addPersonID(String id) {
        this.add(id);
    }

    public void removePersonID(String id) {
        this.remove(id);
    }
    
    public void printPersonIDs() {
        for (Object id : this) {
            System.out.println(id);
        }
    }
}
