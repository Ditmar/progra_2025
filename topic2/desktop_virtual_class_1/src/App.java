import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Federico", "Simpsom", "44332211");
        person.print();
        System.out.println("---------------------------------");
        LocalDate nowDate = LocalDate.now();
        person.print(nowDate.toString());

        Student student = new Student("Pablo", "Morales", "32432w43");
        student.programSubject("Tecnicas de Programacion 2 ");
        student.programSubject("Calculo diferencial e Integral");
        student.programSubject("Dinamica de Sistemas");
        student.print(true);
    }
}
