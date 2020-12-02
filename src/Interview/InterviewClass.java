package Interview;

public class InterviewClass {

    int i;

    {
        System.out.println("IIB Called");
        System.out.println(i);
    }

    static {
        System.out.println("SIB Called");
    }

    InterviewClass() {
        System.out.println("Hello From Constructor " + this);
    }

    InterviewClass(int a, int b) {
        System.out.println("Called Parameterised Constructor");
    }

    static int add(int a, int b) {
        return 5;
    }

    static int add(int a, double b) {
        return 6;
    }

}
