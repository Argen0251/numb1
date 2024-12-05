import java.util.Scanner;

public class home_work1 {
    public static void main(String[] args) {

        String ter;
        final int num = -1;
        String word = "wolrd";
        ter = num + word;
        System.out.println("переменная номер 1:" + ter);
        System.out.println("переменная номер 2:" + num);
        System.out.println("переменная номер 3:" + word);
        if (num<  0){

            System.out.println(" Вы сохранили отрицательное число ");
        } else if (num>0) {
            System.out.println(" Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль ");
        }
        String name;
        Scanner name1 = new Scanner(System.in);
        System.out.println(" Введите ваше имя");
        name= name1.nextLine();
        System.out.println(" Privet " + name);
    }





}
