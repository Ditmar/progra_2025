import java.util.Scanner;

import grade.GradeManagement;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyBoard = new Scanner(System.in);
        GradeManagement gradeManagement = new GradeManagement();

        while (true) {
            createMenu();
            String input = keyBoard.nextLine();
            if (input.equals("1")) {
                System.out.println("Escriba la nota del estudiante");
                Double grade = keyBoard.nextDouble();
                gradeManagement.addGrade(grade);
            } else if (input.equals("2")) {
                System.out.println("Lista de notas:");
                gradeManagement.showGrades();
            } else if (input.equals("3")) {
                System.out.println("Lista de aprobados");
                gradeManagement.showApprovedGrades();
            } else if (input.equals("4")) {
                break;
            }
        }
        System.out.println("close program");
        keyBoard.close();
    }

    public static void createMenu() {
        System.out.println("1. Agregar Nota");
        System.out.println("2. Ver Nota");
        System.out.println("3. Ver aprobados");
        System.out.println("4. Salir");
    }

}
