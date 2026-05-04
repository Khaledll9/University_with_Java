package Unvirsety;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student extends Person {

    private static int id = 115;
    private ArrayList subject = new ArrayList<>(Arrays.asList("Math", 0, "Java", 0, "Data Structure", 0));
    private static ArrayList<Student> arrayStudent = new ArrayList();

    Student() {

    }

    public Student(String name, String phoneNumber, int age, short level, int id) {
        super(name, phoneNumber, age, level);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.level = level;
        this.id = id;

    }

    public ArrayList getSubject() {
        return subject;
    }

    // public ArrayList arrayValue (ArrayList aList){
    // Scanner scan = new Scanner(System.in);
    // aList.set(1, scan.nextInt());
    // aList.set(3, scan.nextInt());
    // aList.set(5, scan.nextInt());
    // // Scanner scan = new Scanner(System.in);
    // // int length = subject.size();
    // // for (int i = 0; i < length; i++) {
    // // System.out.println("Enter the " + subject.get(i) + " grades");
    // // subject.set(++i, scan.nextInt());
    // // }
    // return aList;
    // }

    public void getStudentGrades() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name");
        String search = input.nextLine();
        for (Student student : arrayStudent) {
            if (student.name.equals(search)) {
                int length = subject.size();
                System.out.println("===========\n" + student.getName() + " grades are");
                for (int i = 0; i < length; i++) {
                    System.out.println(student.subject.get(i) + " = " + student.subject.get(++i));
                }
                System.out.println("=================");
                return;
            }
        }
        System.out.println("Name not found");
        System.out.println("================");
        // System.out.print(subject.get(0));
        // System.out.println(" = " + subject.get(1));
        // System.out.print(subject.get(2));
        // System.out.println(" = " + subject.get(3));
        // System.out.print(subject.get(4));
        // System.out.println(" = " + subject.get(5));

    }

    public void modifyStudentGrades() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student name");
        String search = input.nextLine();
        for (Student student : arrayStudent) {
            if (student.name.equals(search)) {
                Scanner scan = new Scanner(System.in);
                int length = subject.size();
                for (int i = 0; i < length; i++) {
                    System.out.println("Enter the " + student.subject.get(i) + " grades");
                    student.subject.set(++i, scan.nextInt());

                }
                System.out.println("Grades added successfully");
                System.out.println("===============================");
                return;
            }

            // System.out.println("\nEnter the Math grades");
            // subject.set(1, scan.nextInt());
            // System.out.println("Enter the Java grades");
            // subject.set(3, scan.nextInt());
            // System.out.println("Enter the Data Structure grades");
            // subject.set(5, scan.nextInt());
            // orgnizeSubject ();
        }
        System.out.println("Name not found");
        System.out.println("================");
    }

    public static ArrayList<Student> studentsData() {
        Student s1 = new Student("Khaled", "775125320", 21, (short) 2, id++);
        Student s2 = new Student("Youssef", "773181327", 20, (short) 2, id++);
        Student s3 = new Student("Mahmoud", "739320800", 20, (short) 2, id++);
        s1.subject.set(1, 80);
        s1.subject.set(3, 95);
        s1.subject.set(5, 90);
        s2.subject.set(1, 95);
        s2.subject.set(3, 98);
        s2.subject.set(5, 96);
        s3.subject.set(1, 92);
        s3.subject.set(3, 94);
        s3.subject.set(5, 97);

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        return studentList;

    }

    static {
        arrayStudent = studentsData();
    }

    public void dispalyAllStudent() {
        for (Student student1 : arrayStudent) {
            System.out.println(student1.getName());
        }
        System.out.println("===================");
    }

    public void studentiInformation() {
        System.out.println("Enter number 1 to search by name");
        System.out.println("Enter number 2 to see all student information");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the student name");
                input.nextLine();
                String search = input.nextLine();
                for (Student student : arrayStudent) {
                    if (student.name.equals(search)) {
                        System.out.println("================");
                        System.out.println("name = " + student.name + "\nPhone number = " +
                                student.phoneNumber + "\nage = " + student.age + "\nlevel = " + student.level +
                                "\nID = " + student.id);
                        // student.subject. = setSubject(subject);
                        System.out.println("================");
                        return;

                    }

                }

                System.out.println("name isn't found");
                System.out.println("================");

                break;
            case 2:
                for (Student student : arrayStudent) {
                    System.out.println("name = " + student.name + "\nPhone number = " +
                            student.phoneNumber + "\nage = " + student.age + "\nlevel = " + student.level +
                            "\nID = " + student.id + "\nstudetn grades = " + student.getSubject());
                    System.out.println("==========");
                }
                break;

            default:
                Main.dispalyError();
                break;
        }

    }

    public void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        name = input.nextLine();
        System.out.println("Enter the phone number");
        phoneNumber = input.nextLine();
        System.out.println("Enter the age ");
        age = input.nextInt();
        System.out.println("Enter the level");
        level = input.nextShort();
        id++;
        // setSubject(arrayValue(subject));
        Student student = new Student(name, phoneNumber, age, level, id++);
        // student.modifyStudentGrades();
        // ArrayList<Student> newStudent = new ArrayList<>();
        // newStudent.add(student);
        arrayStudent.add(student);
        System.out.println("Student is added successfully");
        System.out.println("===============================");

    }

    @Override
    public String toString() {
        return "Student [name =" + name + ", phone Number =" + phoneNumber + ", age =" + age + ", " +
                ", level =" + level + ", ID =" + id + "]" + subject.toString();

    }

    public void removeStudent() {
        arrayStudent.removeLast();
        System.out.println("The student is removed successfully \n=================================");
    }

    // public float getStudentAverage() {
    // Scanner input = new Scanner(System.in);
    // System.out.println("The student name ");
    // String sreach = input.nextLine();
    // for (Student student : arrayStudent) {
    // if (student.getName().equals(sreach)) {
    // float average = 0;
    // float length = subject.size() / 2;
    // for (int i = 1; i < length; i++) {
    // average += subject.get(++i);
    // }
    // System.out.println("The studen average is ");
    // return average / length;
    // }
    // }
    // System.out.println("The studen not found ");
    // return 0;
    // }
    // float average = 0;
    // float length = subject.size() / 2;
    // for (int i = 1; i < length; i++) {
    // average += subject.indexOf(i);
    // i++;
    // }
    // return average / length;
    // }
    public static void studentSection() {
        System.out.println("===== You are in the student section =====\n");

        do {

            System.out.println("press 1 to dispaly all the student");
            System.out.println("press 2 to see student's information");
            System.out.println("press 3 to see student's grades ");
            System.out.println("press 4 to modify student's grades ");
            System.out.println("press 5 to add a student");
            System.out.println("press 6 to remove a student");
            System.out.println("press 7 to go to the home page");
            System.out.println("============================================");
            // System.out.println("press 5 to get student's averge ");

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            Student obj = new Student();

            switch (number) {
                case 1:
                    obj.dispalyAllStudent();
                    break;
                case 2:
                    obj.studentiInformation();
                    break;
                case 3:
                    obj.getStudentGrades();
                    break;
                case 4:
                    obj.modifyStudentGrades();
                    break;
                case 5:
                    obj.addStudent();
                    break;
                case 6:
                    obj.removeStudent();
                    break;
                case 7:
                    homePage();
                    break;
                // case 5:
                // // System.out.println( obj.getStudentAverage() + "\n =====================");
                // break;

                default:
                    Main.dispalyError();
                    break;
            }
            // input.close();
        } while (true);
    }
}