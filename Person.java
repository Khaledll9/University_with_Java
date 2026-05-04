package Unvirsety;

public class Person {
    protected String name;
    protected String phoneNumber;
    protected int age;
    protected short level;

    public Person() {

    }

    public Person(String name, String phoneNumber, int age, short level) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public short getLevel() {
        return level;
    }

    public void setLevel(short level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age + ", level=" + level + "]";
    }

    public static void homePage() {
        Main.main(null);
    }

    // Scanner input = new Scanner(System.in);
    // System.out.println("Enter the name");
    // name = input.nextLine();
    // System.out.println("Enter the phone number");
    // phoneNumber = input.nextLine();
    // System.out.println("Enter the age ");
    // age = input.nextInt();
    // System.out.println("Enter the level");
    // level = input.nextShort();

}
