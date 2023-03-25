import java.util.Scanner;

class Student {
    int a;
    int b;
    int rollNo;
    String studentName;

    Student(int x, int y) {
        a = x;
        b = y;

    }

    int add() {
        int ans = a + b;
        return ans;
    }

    int sub() {
        return a - b;

    }

    int product() {
        return a * b;
    }

}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student(10, 20);
        obj1.rollNo = 1;
        obj1.studentName = "Sam";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2 = new Student(30, 40);
        obj2.rollNo = 7;
        obj2.studentName = "Jha";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        Student obj = new Student(x, y);
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.product());

        // Student obj0 = new Student(10, 20);
        // System.out.println(obj0.add());
        // System.out.println(obj0.sub());
        // System.out.println(obj0.product());

        // System.out.println(Math.sqrt(24));
        // System.out.println(Math.sqrt(16));

        // System.out.println(Math.floor(5.3));
        // System.out.println(Math.floor(5.8));

        // System.out.println(Math.ceil(5.3));
        // System.out.println(Math.ceil(5.8));

    }

}
