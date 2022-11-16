import java.util.ArrayDeque;

public class CustomerQueue extends ArrayDeque<String> {
    public void addCustomer(String name) {
        this.add(name);
    }

    public void removeCustomer() {
        this.remove();
    }

    public void printCustomers() {
        for (String name : this) {
            System.out.println(name);
        }
    }
    
}
