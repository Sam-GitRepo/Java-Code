public class AccessMod {
    public String str_1 = "Public class";

    void printPublic() {
        System.out.println("In class " + str_1);
    }

    public static void main(String[] args) {
        AccessMod obj = new AccessMod();
        obj.printPublic();
        System.out.println("In class " + obj.str_1);
        // Outside the class
        App2 obj2 = new App2();
        obj2.pritnOutside();
        //
        App3 obj3 = new App3();
        obj3.printChildClass();

    }
}

class App2 {
    void pritnOutside() {
        AccessMod obj = new AccessMod();
        System.out.println("Outside class " + obj.str_1);

    }
}

// child class //parent class
class App3 extends AccessMod {
    void printChildClass() {
        App3 obj3 = new App3();
        System.out.println("print from child class " + obj3.str_1);

    }

}
