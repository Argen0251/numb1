package lesson1_2;

public class lesson2_2 {
    public static void main(String[] args) {
        int temperature =5;
        int numstudent =10;
        boolean isSnow =false;
        if(temperature>0 && numstudent >5){
            System.out.println( " Идем парк");
        }
        // оператор ии && в которых все условие должны выполнится
        if (isSnow || temperature<10){
            System.out.println("Остаемся дома");
        }
        // оператор || для условий или, или первый или второй будет правильным оно выполняется
        if (!isSnow){
            System.out.println("Снега нету, идем на прогулку");
        }
        // оператор ! если условие false оно выполняется

    }
}
