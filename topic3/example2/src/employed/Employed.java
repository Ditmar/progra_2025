package employed;
public class Employed {
    private String name;
    private Double salary;
    private Integer age;
    public Employed(String name, Double salary, Integer age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void print() {
        System.out.println("* : " + this.name + " / " + this.age + " / " + this.salary );
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    
}