package Day4.Module1_Constructors;
package Day4.Module1_Constructors;
public class Hello {
    String name;

    // Constructor
    Hello() {
        name = "Web Technologies";
    }

    public static void main(String a[]) {
        Hello obj = new Hello();
        System.out.println(obj.name);
    }
}