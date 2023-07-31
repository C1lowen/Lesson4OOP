package lesson4_oop_level1_task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Group group = new Group();

        NewStudent student = new NewStudent();

        System.out.println("Введите имя группы");
        String inputGroupName = sc.nextLine();
        group.setGroupName(inputGroupName);

        System.out.println("Сколько студентов вы хотите добавить?");
        int studentWantToInput = sc.nextInt();

        for (int i = 1; i <= studentWantToInput; i++) {
            System.out.println("Студент #" + i);
            Student studentNew = student.createNewStudent();
            boolean studentAdd = student.addStudentForGroup(group, studentNew);
            if (studentAdd == false) {
                break;
            }
        }
        group.sortStudentsByLastName();
        for (Student student1 : group.getStudents()) {
            if (student1 != null) {
                System.out.println(student1);
            }
        }

    }


}
