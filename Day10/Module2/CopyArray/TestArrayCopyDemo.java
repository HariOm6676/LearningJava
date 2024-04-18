class TestArrayCopyDemo {
    public static void main(String args[]) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'a', 'a', 'a' };
        char[] copyTo = new char[5];
        System.arraycopy(copyFrom, 2, copyTo, 0, 5);
        System.out.println(String.valueOf(copyTo));
    }
}