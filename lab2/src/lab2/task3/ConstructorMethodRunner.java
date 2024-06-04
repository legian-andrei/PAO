package lab2.task3;

public class ConstructorMethodRunner {
    public static void main(String[] args) {
        foo(new B());
    }

    static void foo(A a) {
        a.add(8);
        a.print();
//        20
    }
}

class A {
    protected int number;
    A(int value) {
        System.out.println("A():" + number);
        add(value);
    }

    public void add(int value) {
        System.out.println("A.add():" + number);
        number += value;
    }

    public void print() {
        System.out.println(number);
    }
}

class B extends A {
    B() {
        super(2);
        System.out.println("B():" + number);
    }

    public void add(int value) {
        System.out.println("B.add():" + number + ", " + value);
        number += value * 2;
    }
}