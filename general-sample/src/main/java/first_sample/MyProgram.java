package first_sample;

public class MyProgram extends MyProgramParent implements MyInterface {

    public void sayHello() {
        System.out.println("Hello `Balkan FLOSStival 2020`");
    }

    public static void main(String[] args) {
        byte b = 126;
        short s = 1024;
        char c = 'c';
        int i = 10;
        long l = 10L;

        float piFloat = 3.145f;
        double piDouble = Math.PI;

        MyProgram myProgram = new MyProgram();
        myProgram.sayHello();
    }
}

abstract class MyProgramParent {
}

interface MyInterface {
    void sayHello();
}


