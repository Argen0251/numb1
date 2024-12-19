package test_0.old_;

public class VehicleDemo    {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();
        int range;
        int range2;

// Присвоить значения полям
        minivan.passengers =5;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportCar.passengers = 2;
        sportCar.fuelcap = 20;
        sportCar.mpg = 15;
// Рассчитать дальность поездки при полном баке
        range = minivan.fuelcap * minivan.mpg;
        range2 = sportCar.fuelcap * sportCar.mpg;
        System.out.println("Mини-фypгoн может перевезти " +
                minivan.passengers + " пассажиров на расстояние " + range +
                " миль");
        System.out.println("Спорткар может перевезти " +
                sportCar.passengers + " пассажиров на расстояние " + range2 +
                " миль");
        sportCar.range();

    }
}
