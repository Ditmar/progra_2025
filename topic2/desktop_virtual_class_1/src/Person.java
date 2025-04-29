public class Person {
    private String name;
    private String lastName;
    private String ci;

    public Person(String name, String lastName, String ci) {
        this.name = name;
        this.ci = ci;
        this.lastName = lastName;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Ci: " + this.ci);
        System.out.println("LastNane: " + this.lastName);
    }

    public void print(String date) {
        System.out.println("Name: " + this.name);
        System.out.println("Ci: " + this.ci);
        System.out.println("LastNane: " + this.lastName);
        System.out.println("Date Now " + date);
    }
}
