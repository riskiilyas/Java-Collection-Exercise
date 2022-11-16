public class Main{
    public static void main(String[] args) {
        // Arraylist
        StudentList studentList = new StudentList();
        studentList.addStudent("John");
        studentList.addStudent("Mary");
        studentList.addStudent("Jane");
        studentList.printStudents();

        // Set
        PersonIDSet personIDSet = new PersonIDSet();
        personIDSet.addPersonID("123456");
        personIDSet.addPersonID("234567");
        personIDSet.addPersonID("345678");
        personIDSet.printPersonIDs();

        // Stack
        BookStack bookStack = new BookStack();
        bookStack.addBook("Harry Potter");
        bookStack.addBook("Lord of the Rings");
        bookStack.addBook("The Hobbit");
        bookStack.printBooks();

        // Queue
        CustomerQueue customerQueue = new CustomerQueue();
        customerQueue.addCustomer("John");
        customerQueue.addCustomer("Mary");
        customerQueue.addCustomer("Jane");
        customerQueue.printCustomers();
    
        // Map
        LockerRoomHashMap lockerRoomHashMap = new LockerRoomHashMap();
        lockerRoomHashMap.addLocker("John", "books");
        lockerRoomHashMap.addLocker("Mary", "clothes");
        lockerRoomHashMap.addLocker("Jane", "");
        System.out.println(lockerRoomHashMap.getLocker("John"));
        lockerRoomHashMap.printLockers();
    }
}