package Education;

public class hhj {
    public static void main(String[] args) {


        class_ obj1 = new class_(10, 5);
        class_ obj2 = new class_(5, 20);
        System.out.println("Before change:"+obj1.a+" "+obj1.b);
        obj2.change(obj1);
        System.out.println("After change:"+obj1.a+" "+obj1.b);
        

    }
}