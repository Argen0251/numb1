package test_0;

public class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон
    void range(){
        System.out.println("Дaльнocть - " + fuelcap * mpg + " миль.");
    }
}
