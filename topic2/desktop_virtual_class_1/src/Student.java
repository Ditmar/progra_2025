import java.util.ArrayList;

public class Student extends Person {
    public ArrayList<String> subjets;

    public Student(String name, String lastName, String ci) {
        super(name, lastName, ci);
        this.subjets = new ArrayList<>();
    }

    public void programSubject(String subjet) {
        this.subjets.add(subjet);
    }

    public void print(Boolean printAllData) {
        if (printAllData) {
            this.print();
            for (String subject : this.subjets) {
                System.out.println(subject);
            }
            return;
        }
        this.print();
    }
}
