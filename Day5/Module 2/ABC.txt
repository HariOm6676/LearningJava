class ABC {
    int a;
    int b;
    int res;
    ABC() {
        System.out.println("From const 1");
    }

    ABC(int a,int b) {
        this();
        res=a+b;
        System.out.println("From const 2 ");
    }
    ABC(int a, int b, int c)
    {
        this(a,b);
        res=res+c;
        System.out.println("From const 3 "+res);
    }

    public static void main(String[] a) {
        ABC a1 = new ABC(2,3,4);
    }
}