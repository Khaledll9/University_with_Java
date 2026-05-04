package Unvirsety;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person {
    private final static int SALARY = 8000;
    private short workingHours;
    private float bonus;
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    public Teacher() {

    }

    public int getSALARY() {
        return SALARY;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(short workingHours) {
        this.workingHours = workingHours;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Teacher(short workingHours, float bonus) {
        this.workingHours = workingHours;
        this.bonus = bonus;
    }

    public Teacher(String name, String phoneNumber, int age, short level, short workingHours, float bonus) {
        super(name, phoneNumber, age, level);
        this.workingHours = workingHours;
        this.bonus = bonus;
    }

    public float teacherSalary() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the teacher");
        String name = input.nextLine();
        for (Teacher teacher : teachers) {
            if (teacher.name.equals(name)) {
                setName(teacher.name);
                setWorkingHours(teacher.workingHours);
                setBonus(teacher.bonus);
                System.out.print("Teacher " + getName() + "'s salary is = ");
                return (getSALARY() * getWorkingHours() * getBonus());
            }

        }
        System.out.println("Teacher name is wrong");
        return 0;
    }

    public void modifyTeacherinfo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the teacher name");
        String search = scan.nextLine();
        for (Teacher teacher : teachers) {
            if (teacher.name.equals(search)) {
                Scanner input = new Scanner(System.in);
                String oldTeacher = teacher.getName();
                System.out.println("Enter the name of the teacher");
                teacher.setName(input.nextLine());
                System.out.println("Enter the phone number");
                teacher.setPhoneNumber(input.nextLine());
                System.out.println("Enter the age");
                teacher.setAge(input.nextInt());
                System.out.println("Enter the level");
                teacher.setLevel(input.nextShort());
                System.out.println("Enter the working hours");
                teacher.setWorkingHours(input.nextShort());
                System.out.println("Enter the bouns");
                teacher.setBonus(input.nextFloat());
                System.out.println("Teacher " + oldTeacher + " is modified successfully\n================");
                return;
            }

        }
        System.out.println("Teacher is not found");
        System.out.println("======================");

    }

    public static ArrayList<Teacher> teachersData() {
        Teacher teacher1 = new Teacher("Ahmed", "775125320", 30, (short) 2, (short) 2, (float) 1.50);
        Teacher teacher2 = new Teacher("Abdo Algbar", "773777758", 40, (short) 3, (short) 4, (float) 1.20);
        Teacher teacher3 = new Teacher("Faten", "770010084", 33, (short) 1, (short) 6, (float) 1.25);

        ArrayList<Teacher> teacherstsList = new ArrayList<>();

        teacherstsList.add(teacher1);
        teacherstsList.add(teacher2);
        teacherstsList.add(teacher3);

        return teacherstsList;

    }

    static {
        teachers.addAll(teachersData());
    }

    public void dispalyAllTeacher() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }
        System.out.println("===================");
    }

    public void teacherInformation() {
        for (Teacher teacher : teachers) {
            System.out.println("name = " + teacher.name + "\nPhone number = " +
                    teacher.phoneNumber + "\nage = " + teacher.age + "\nlevel = " + teacher.level +
                    "\nSalary = " + teacher.SALARY);
            System.out.println("=============");

        }
    }

    public void addTeacher() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the teacher");
        name = input.nextLine();
        System.out.println("Enter the phone number");
        phoneNumber = input.nextLine();
        System.out.println("Enter the age");
        age = input.nextInt();
        System.out.println("Enter the level");
        level = input.nextShort();
        System.out.println("Enter the working hours");
        workingHours = input.nextShort();
        System.out.println("Enter the bouns");
        bonus = input.nextFloat();

        Teacher teacher = new Teacher(name, phoneNumber, age, level, workingHours, bonus);
        // ArrayList<Teacher> newTeacher = new ArrayList<>();
        // newTeacher.add(teacher);
        teachers.add(teacher);
        System.out.println("Teacher is added successfully\n================");

    }

    public void removeTeacher() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index of the teacher");
        int removeAt = input.nextInt();
        if (removeAt >= 0 && removeAt < teachers.size()) {
            {
                System.out.println("The Teacher " + teachers.get(removeAt).name + " is removed successfully ");
                teachers.remove(removeAt);
                System.out.println("====================================");
            }
        } else {
            System.out.println("The index is out of range");
            System.out.println("====================================");
        }
        // teachers.removeLast();
        // System.out.println("teacher is removed successfully");
        // System.out.println("====================================");

    }

    public static void teacherSection() {
        System.out.println("===== You are in the teacher section =====\n");

        do {

            System.out.println("press 1 to dispaly all the teacher");
            System.out.println("press 2 to see teacher's information");
            System.out.println("press 3 to modify teacher's information");
            System.out.println("press 4 to add a teacher");
            System.out.println("press 5 to remove a teacher");
            System.out.println("press 6 to get teacher salary ");
            System.out.println("press 7 to go to the home page");
            System.out.println("============================================");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            Teacher teacher = new Teacher();

            switch (number) {
                case 1:
                    teacher.dispalyAllTeacher();
                    break;
                case 2:
                    teacher.teacherInformation();
                    break;
                case 3:
                    teacher.modifyTeacherinfo();
                    break;
                case 4:
                    teacher.addTeacher();
                    break;
                case 5:
                    teacher.removeTeacher();
                    break;
                case 6:
                    System.out.println(teacher.teacherSalary() + "\n==================");
                    break;
                case 7:
                    homePage();
                    break;

                default:
                    Main.dispalyError();
                    break;
            }

        } while (true);

    }
}
