public class Hello {
    int age;
    int sal;

    Hello() {
        System.out.println("constructor 1");
    }

    Hello(int age) {
        this.age = age;
        System.out.println("Constructor 2");
    }

    Hello(int age, int sal) {
        this.age = age;
        this.age = sal;
        System.out.println("Constructor 3");
    }

    public static void main(String[] a) {
        Hello obj1 = new Hello();
        Hello obj2 = new Hello(40);
        Hello obj3 = new Hello(40, 50000);
        System.out.println(obj1.age + " " + obj1.sal);
        System.out.println(obj2.age + " " + obj2.sal);
        System.out.println(obj3.age + " " + obj3.sal);
    }
}