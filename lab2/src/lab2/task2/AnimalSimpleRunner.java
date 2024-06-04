package lab2.task2;

public class AnimalSimpleRunner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.produceSound();
//        BARK!

        Cat cat = new Cat();
        ((Animal) cat).produceSound();
//        Meow!
    }
}

class Animal {
    public void produceSound() {
        System.out.println("<Undefined sound>");
    }
}

class Dog extends Animal {
    public void produceSound() {
        System.out.println("BARK!");
    }
}

class Cat extends Animal {
    public void produceSound() {
        System.out.println("Meow!");
    }
}