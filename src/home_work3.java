import java.util.Arrays;

public class home_work3 {
    public static void main(String[] args) {
        double[] numbers = {2.2,3.5,-6.6,-9.9,2.0,4.5,-6.4,-3.7,-7.1,2.6,4.7,-4.2,-6.7,3.7,7.7};
        double sum=0;
        int count=0;
        boolean minus=true;
        for (double number : numbers) {

            if (minus) {
                if (number < 0) {
                    minus = false;
                }
            } else if (number > 0) {
                sum += number;
                count++;
                System.out.println("Число "+ count+ " после первого отрицательного: " + number);
            }
        }
        double sredn = sum/count;
        System.out.println(" Среднее арифметическое положительных чисел после первого отрицательного: "+ sredn);


    }
}
