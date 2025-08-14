public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // object from the class
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "DivyaSharma";
        myAcc.setPassword("dbchvbhvj"); // can only set a password but cant access

        Student s1 = new Student("Divya Sharma");
        System.out.println(s1.name);
        Student s2 = new Student();

        // Student s1 = new Student();
        // s1.name = "Divya Sharma";
        // s1.age = 23;
        // s1.percentage = 98.4f;

        // Student s2 = new Student(s1);
        // s2.percentage = 88.4f;
    }

}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private int tip;
    private String color;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    Student(Student s1) { // copy constructor
        this.name = s1.name;
        this.age = s1.age;
    }

    Student(String name) { // parameterized
        this.name = name;
    }

    Student() { // non parameterized
        System.out.println("constructor is called...");
    }

    void percentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;

    }
}
