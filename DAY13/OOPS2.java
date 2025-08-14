package DAY13;

public class OOPS2 {
    public static void main(String args[]) {
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.breed = "desiii";
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Mammal extends Animal {
    void walks() {
        System.out.println("walks");
    }
}

class bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

// class Dog extends Mammal {
// String breed;
// }

// derived class
// class Fish extends Animal { // single level inheritance
// int fins;

// void swim() {
// System.out.println("fish swims");
// }
// }
