package test_0.old_;

import java.util.Scanner;

public class Help_Class_Demo {
    public static void main(String[] args) {
        Help_ help = new Help_();
        Scanner scanner = new Scanner(System.in);
        char choice;

        help.showmenu();

        do {
            System.out.print("Ваш выбор: ");
            choice = scanner.next().charAt(0);

            if (help.isvalid(choice)) {
                help.helpon(choice);
            } else if (choice != 'q') {
                System.out.println("Неверный ввод! Попробуйте снова.");
            }

        } while (choice != 'q');

        System.out.println("Выход из программы. До свидания!");
    }
}
