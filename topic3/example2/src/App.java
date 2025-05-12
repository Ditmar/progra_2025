import java.util.ArrayList;
import java.util.Comparator;

import employed.Employed;

public class App {
    public static void main(String[] args) throws Exception {
        Employed e1 = new Employed("John", 50000.0, 30);
        Employed e2 = new Employed("Jane", 60000.0, 28);
        Employed e3 = new Employed("Doe", 70000.0, 35);
        Employed e4 = new Employed("Alice", 80000.0, 32);
        Employed e5 = new Employed("Bob", 90000.0, 29);
        Employed e6 = new Employed("Charlie", 100000.0, 40);
        Employed e7 = new Employed("David", 110000.0, 45);
        Employed e8 = new Employed("Eve", 120000.0, 50);
        Employed e9 = new Employed("Frank", 130000.0, 55);
        Employed e10 = new Employed("Grace", 140000.0, 60);
        ArrayList<Employed> employees = new ArrayList<Employed>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
        

        employees.stream().filter(item -> item.getAge() > 30)
        .sorted(Comparator.comparingDouble(Employed::getSalary))
        .map(item -> {
            item.setName("*: " + item.getName().toUpperCase());
            return item;
        })
        .forEach(employed -> employed.print());
    }
}
