public class lesson2_3 {
    public static void main(String[] args) {
        System.out.println("Завтрак");
        makeTea();
        System.out.println("Обед");
        makeTea();
        System.out.println("Ужин");
        makeTea();
    calculatev(3, 5.4f, "office");

    }
    public static void calculatev(float a, float b, String namek) {
        float result =a*b;
        System.out.println("площадь комнаты : "+ namek +" :" + result);


    }



    public static void makeTea(){

        System.out.println(" Насыпать заварку");
        System.out.println(" Вскипитить воду");
        System.out.println(" Залить в чашку");
    }
}
