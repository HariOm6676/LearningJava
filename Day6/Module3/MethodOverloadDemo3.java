class MethodOverloadDemo3 {
    void overloadDemo(float a, int b) {
        System.out.println("From Method 1 " + a + b);
    }

    void overloadDemo(int a, float b) {
        System.out.println("From Method 2 " + a + b);
    }

    public static void main(String args[]) {
        MethodOverloadDemo3 md1 = new MethodOverloadDemo3();
        md1.overloadDemo(3.2f, 5);
        md1.overloadDemo(3, 3.2f);

    }
}