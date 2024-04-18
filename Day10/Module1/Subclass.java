package Day10.Module1;
public class Subclass extends Parentclass {
    Subclass() {
        System.out.println("Constructor of child class");
    }

    Subclass(int num) {
        System.out.println("Parameterized constructor of child class");
    }

    void display() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        Subclass obj = new Subclass();
        obj.display();
        Subclass obj2 = new Subclass();
        obj2.display();
    }
}