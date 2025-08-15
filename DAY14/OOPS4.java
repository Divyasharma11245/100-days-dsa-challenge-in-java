public class OOPS4 {

    public static void main(String args[]) {

        Mustang myHorse = new Mustang();
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color); // brown kyunki yaha parent class ka co tructor
        // call hoga aur by default brown
        // color sab animals ko dega

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    }
}

abstract class Animal {

    String color;

    Animal() { // constructor of abstract classes
        System.out.println("Animal comstructor is called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    super.color="brown";

    Horse() {
        System.out.println("horse constructor is called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
