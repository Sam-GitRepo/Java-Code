import java.util.Scanner;

public class Brute {

    public static void main(String[] args) {
        // System.out.println(StarkMath.MIN_VALUE);
        // StarkMath math = new StarkMath();

        // System.out.println(math.getImportanNumber());
        Bhalu bhalu = new Bhalu();
        bhalu.speak();
        bhalu.walk();
        bhalu.running();

        Kangaroo kangaroo = new Kangaroo();
        kangaroo.speak();
        System.out.println(kangaroo.legs);

        Rabbit rabbit = new Rabbit();
        rabbit.speak();

        Dog dog = new Dog();
        System.out.println(dog.legs);
    }
}

class CommonAnimalClass {
    int legs = 4;

    public void speak() {
        System.out.println("Making sound!");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }

    public void running() {
        System.out.println("Animal is running!!");
    }

    public void jogging() {
        System.out.println("Animal is jogging!!");
    }
}

class Bhalu extends CommonAnimalClass {
}

class Rabbit extends CommonAnimalClass {
}

class Lion extends CommonAnimalClass {
}

class Kangaroo extends CommonAnimalClass {
    int legs = 2;
}

class Dog extends CommonAnimalClass {
}

class StarkMath {
    final static int MIN_VALUE = -2147483648;
    final static int MAX_VALUE = 2147483647;
    private int IMPORTANT_NUMBER = 1543152;

    public int getImportanNumber() {
        return IMPORTANT_NUMBER;
    }

    public void setImportanNumber(int IMPORTANT_NUMBER_INPUT) {
        IMPORTANT_NUMBER = IMPORTANT_NUMBER_INPUT;
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static int max(int a, int b) {
        return a < b ? b : a;
    }
}

// DRY -> Don't repeat yourself
// Process -> Using blueprint -> (Do something here) -> Creating object
// Constructors -> Default, user-defined, Copy-Constructor

// Car fortuner = new Car();
// fortuner.wheelSize = 4;
// fortuner.color = "Blue";

// Car thar = new Car();
// thar.wheelSize = 5;
// thar.color = "Black";

// Car audi = new Car(5, "Green");

// Car audi2 = new Car(audi);

// static class Car{
// int wheelSize;
// String color;
// int mileage;

// public Car(int wheelSizeInput, String colorInput){
// wheelSize = wheelSizeInput;
// color = colorInput;
// // not assigning mileage
// }

// // public Car(Car carToCopyFrom) {
// // wheelSize = carToCopyFrom.wheelSize;
// // color = carToCopyFrom.color;
// // mileage = carToCopyFrom.mileage;
// // }
// }

// 10, 20,30 ,40,50,70,70...100;