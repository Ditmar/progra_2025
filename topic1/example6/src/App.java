import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        // O(n) time complexity
        // o(1)
        // ArrayList<Person> people = new ArrayList<>();
        // people.add(new Person("John", "Doe", "1234567"));
        // people.add(new Person("Jane", "Doe", "7654321"));
        // people.add(new Person("Alice", "Smith", "9876543"));
        // people.add(new Person("Bob", "Johnson", "4567890"));
        // people.add(new Person("Charlie", "Brown", "1122334"));
        // people.add(new Person("Diana", "Prince", "9988776"));
        // people.add(new Person("Eve", "Adams", "3344556"));
        // people.add(new Person("Frank", "Miller", "7788990"));
        // people.add(new Person("Grace", "Hopper", "2233445"));
        // people.add(new Person("Hank", "Pym", "6677889"));
        // people.add(new Person("Ivy", "Green", "5566778"));
        // people.add(new Person("Jack", "White", "4455667"));
        // people.add(new Person("Karen", "Black", "8899001"));
        // people.add(new Person("Leo", "Gray", "9988002"));
        // people.add(new Person("Mona", "Lisa", "3344668"));
        // people.add(new Person("Nina", "Brown", "1122446"));
        // people.add(new Person("Oscar", "Blue", "5566889"));
        // people.add(new Person("Peter", "Parker", "7788990"));
        // people.add(new Person("Quinn", "Red", "2233445"));
        // people.add(new Person("Rose", "Yellow", "6677889"));
        // people.add(new Person("Steve", "Rogers", "5566778"));
        // people.add(new Person("Tony", "Stark", "4455667"));
        // people.add(new Person("Uma", "Thurman", "8899001"));
        // people.add(new Person("Victor", "Von Doom", "9988002"));
        // people.add(new Person("Wanda", "Maximoff", "3344668"));
        // people.add(new Person("Xavier", "Charles", "1122446"));
        // people.add(new Person("Yara", "Shahidi", "5566889"));
        // people.add(new Person("Zoe", "Saldana", "7788990"));
        // people.add(new Person("Wade", "Wilson", "2233445"));
        HashMap<String, Person> people = new HashMap<>();
        people.put("1234567", new Person("John", "Doe", "1234567"));
        people.put("7654321", new Person("Jane", "Doe", "7654321"));
        people.put("9876543", new Person("Alice", "Smith", "9876543"));
        people.put("4567890", new Person("Bob", "Johnson", "4567890"));
        people.put("1122334", new Person("Charlie", "Brown", "1122334"));
        people.put("9988776", new Person("Diana", "Prince", "9988776"));
        people.put("3344556", new Person("Eve", "Adams", "3344556"));
        people.put("7788990", new Person("Frank", "Miller", "7788990"));
        people.put("6677889", new Person("Hank", "Pym", "6677889"));
        people.put("5566778", new Person("Ivy", "Green", "5566778"));
        people.put("4455667", new Person("Jack", "White", "4455667"));
        people.put("8899001", new Person("Karen", "Black", "8899001"));
        people.put("9988002", new Person("Leo", "Gray", "9988002"));
        people.put("3344668", new Person("Mona", "Lisa", "3344668"));
        people.put("1122446", new Person("Nina", "Brown", "1122446"));
        people.put("5566889", new Person("Oscar", "Blue", "5566889"));
        people.put("7788990", new Person("Peter", "Parker", "7788990"));
        people.put("6677889", new Person("Rose", "Yellow", "6677889"));
        people.put("4455667", new Person("Tony", "Stark", "4455667"));
        people.put("8899001", new Person("Uma", "Thurman", "8899001"));
        people.put("3344668", new Person("Wanda", "Maximoff", "3344668"));
        people.put("1122446", new Person("Xavier", "Charles", "1122446"));
        people.put("5566889", new Person("Yara", "Shahidi", "5566889"));
        people.put("7788990", new Person("Zoe", "Saldana", "7788990"));
        people.put("2233445", new Person("Wade", "Wilson", "2233445"));
        System.out.println("SIZE " + people.size());
        findHashPerson("John", people);
        // findPerson("3344668", people);
    }

    public static void findHashPerson(String ci, HashMap<String, Person> people) {
        // O(1) time complexity
        Integer counter = 0;
        if (people.containsKey(ci)) {
            people.get(ci).printData();
            counter++;
            System.out.println("Cantidad de iteraciones: " + counter);
        } else {
            System.out.println("Person not found");
        }
    }

    public static void findPerson(String ci, ArrayList<Person> people) {
        // O(n) time complexity
        Integer counter = 0;
        for (Person p : people) {
            counter++;
            if (p.getCi().equals(ci)) {
                p.printData();
                System.out.println("Cantidad de iteraciones: " + counter);
                return;
            }
        }
        System.out.println("Person not found");
    }
}
