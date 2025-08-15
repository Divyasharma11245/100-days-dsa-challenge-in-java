public class OOPS3 {
    public static void main(String[] args) {
        // Calculator c1 = new Calculator();
        // System.out.println(c1.sum(3 + 4));
        // System.out.println(c1.sum(3.3 + 4.2));
        // System.out.println(c1.sum(3 + 4 + 5));

        Deer d = new Deer();
        d.eat();

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}

class Animal {
    void eat() {
        System.out.println("eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eat grass");
    }
}
