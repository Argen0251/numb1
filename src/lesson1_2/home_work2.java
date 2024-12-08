package lesson1_2;

import java.util.Random;
public class home_work2 {

    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), -10));
        System.out.println(permission(generateRandomAge(), -44));
        System.out.println(permission(generateRandomAge(), 4));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), 44));

    }


    public static String permission(int age, int tempertatura) {
        if ((age >= 20 && age <= 45) && tempertatura >= -20 && tempertatura <= 30) {
            return "Можно идти гулять 0";
        } else if (age < 20 && tempertatura >= 0 && tempertatura <= 28) {
            return "Можно идти гулять 1";
        } else if (age > 45 && tempertatura >= -10 && tempertatura <= 25) {
            return "Можно идти гулять 2";
        } else {
            return " Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(100)+1;
        System.out.println("Возраст : " + age);
        return age;
    }
}