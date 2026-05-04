package Unvirsety;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    private String name;
    private int numberOfTeacher;
    private int numberOfStudent;
    private static ArrayList<Department> departments = new ArrayList<>();

    public Department() {

    }

    public Department(String name, int numberOfTeacher, int numberOfStudent) {
        this.name = name;
        this.numberOfTeacher = numberOfTeacher;
        this.numberOfStudent = numberOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTeacher() {
        return numberOfTeacher;
    }

    public void setNumberOfTeacher(int numberOfTeacher) {
        this.numberOfTeacher = numberOfTeacher;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void allStudent() {
        Student student = new Student();
        student.dispalyAllStudent();
    }

    public void allTeacher() {
        Teacher teacher = new Teacher();
        teacher.dispalyAllTeacher();
    }

    public void removedepartment() {
        departments.removeLast();
        System.out.println("department is removed successfully");
        System.out.println("====================================");

    }

    public void addDepartment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the department");
        name = input.nextLine();
        System.out.println("Enter the number of students");
        numberOfStudent = input.nextInt();
        System.out.println("Enter number of teachers");
        numberOfTeacher = input.nextInt();

        Department department = new Department(name, numberOfStudent, numberOfTeacher);
        // ArrayList<Department> newDepartment = new ArrayList<>();
        // newDepartment.add(department);
        departments.add(department);
        System.out.println("Department is added successfully\n================");

    }

    public static ArrayList<Department> departmentsData() {
        Department department1 = new Department("Computer Science", 30, 500);
        Department department2 = new Department("Cyber Security ", 25, 320);
        ArrayList<Department> departmentList = new ArrayList<>();

        departmentList.add(department1);
        departmentList.add(department2);

        return departmentList;
    }

    static {
        departments.addAll(departmentsData());
    }

    public void dispalyAllDepartment() {

        for (Department department : departments) {
            System.out.println(department.getName());
        }
        System.out.println("===================");
    }

    public void departmentinformation() {

        for (Department department : departments) {
            System.out.println("name = " + department.name + "\nNumber Of Studentr = " +
                    department.numberOfStudent + "\nNumber Of Teacher = " + department.numberOfTeacher);
            System.out.println("==========");

        }
    }

    public static void departmentSection() {
        System.out.println("=====You are in the department section=====\n");

        do {

            System.out.println("press 1 to dispaly all department");
            System.out.println("press 2 to see all student ");
            System.out.println("press 3 to see all teacher ");
            System.out.println("press 4 to add a department");
            System.out.println("press 5 to remove a department");
            System.out.println("press 6 to see department's information");
            System.out.println("press 7 to go to the home page");
            System.out.println("============================================");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            Department obj = new Department();

            switch (number) {
                case 1:
                    obj.dispalyAllDepartment();
                    break;
                case 2:
                    obj.allStudent();
                    break;
                case 3:
                    obj.allTeacher();
                    break;
                case 4:
                    obj.addDepartment();
                    break;
                case 5:
                    obj.removedepartment();
                    break;
                case 6:
                    obj.departmentinformation();
                    break;
                case 7:
                    Person.homePage();
                    break;

                default:
                    Main.dispalyError();
                    break;
            }
        } while (true);
    }
}
