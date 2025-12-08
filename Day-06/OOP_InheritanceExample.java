class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

public class OOP_InheritanceExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();

        a.speak();
        d.speak(); // Polymorphism
    }
}
