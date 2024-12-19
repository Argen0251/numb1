package test_0.old_;

public class mass {
    public static void main(String args[]) {
        int riders[][] = new int[7][];
        for (int i = 0; i < 5; i++) {
            riders[i] = new int[10];
        }
        for (int i = 5; i < 7; i++) {
            riders[i] = new int[2];
        }

        // Заполнение массива
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
            }
        }
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
            }
        }

        // Вывод для будних дней
        System.out.println("Количество пассажиров, перевезенных каждым рейсом в будние дни:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }

        // Вывод для выходных дней
        System.out.println("\nКоличество пассажиров, перевезенных каждым рейсом в выходные дни:");
        for (int i = 5; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
    }
}

