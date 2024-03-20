class MethodOverloadDemo2 {
    void overloadDemo(float a) {
        System.out.println("From Method 1 " + a);
    }

    void overloadDemo(int a) {
        System.out.println("From Method 2 " + a);
    }

    public static void main(String args[]) {
        MethodOverloadDemo2 md1 = new MethodOverloadDemo2();
        md1.overloadDemo(3.2f);
        md1.overloadDemo(3);

    }
}