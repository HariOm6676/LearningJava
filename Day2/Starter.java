class Starter {
    public static void main(String ar[]) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s1;
        s1.name = "Tom";
        s1.age = 15;
        s1.percentage= 96;
        s2.name = "Jerry";
        s2.age = 12;
        s2.percentage = 95;
        s1.toLearn();
        s2.toLearn();
        s3.toPlay();
    }
}