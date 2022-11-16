import java.util.*;

public class LockerRoomHashMap extends HashMap<String, String> {
    public void addLocker(String locker, String name) {
        this.put(locker, name);
    }

    public void removeLocker(String locker) {
        this.remove(locker);
    }

    public void changeLocker(String locker, String newName) {
        this.put(locker, newName);
    }

    public String getLocker(String locker) {
        return this.get(locker);
    }

    public void printLockers() {
        for (String locker : this.keySet()) {
            System.out.println(locker + " " + this.get(locker));
        }
    }
}
