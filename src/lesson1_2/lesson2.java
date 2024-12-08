package lesson1_2;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("введите число");
int number = scaner.nextInt();
switch (number)
{
    case 1:
        System.out.println("1");
        break;
    case 2:
        System.out.println("2");
        break;
    case 3:
        System.out.println("3");
        break;
    default:
        System.out.println("Неизвестно");
        break;



}






    }
}
