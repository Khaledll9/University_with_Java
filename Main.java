package Unvirsety;

import java.util.Scanner;

public class Main {

    public static void dispalyError() {
        System.out.println("Error... Please enter number from above");
        System.out.println("============================================");
    }

    static void statrPoint() {

        System.out.println("\n\n \t Welcome to our unvirsety management system. ");
        System.out.println("You are in faculty of Applied Science, computer science deparment ");
        System.out.println("========================================================================\n\n");
        do {
            System.out.println("press 1 to go to the student secion");
            System.out.println("press 2 to go to the teacher secion");
            System.out.println("press 3 to go to the department secion");
            System.out.println("press 4 to exit form the program");
            System.out.println("============================================");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            switch (number) {
                case 1:
                    Student.studentSection();
                    break;
                case 2:
                    Teacher.teacherSection();
                    break;
                case 3:
                    Department.departmentSection();
                    break;
                case 4:
                    System.exit(0);

                default:
                    dispalyError();
                    break;
            }

        } while (true);

    }

    public static void main(String[] args) {
        statrPoint();

    }

}
