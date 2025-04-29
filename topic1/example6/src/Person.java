public class Person {
    private String name;
    private String lastname;
    private String ci;

    public Person(String name, String lastname, String ci) {
        this.name = name;
        this.lastname = lastname;
        this.ci = ci;
    }

    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("Lastname: " + this.lastname);
        System.out.println("ci: " + this.ci);
    }

    public String getCi() {
        return this.ci;
    }
}
