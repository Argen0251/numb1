package Education;

public class erinfo {
    String msg[]={"Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"};
    int howbad[]={3,3,2,4};
    errr getinfo(int x){
        if (x>=0& x<howbad.length){
            return new errr(msg[x], howbad[x]);
        }
        else return new errr("Несуществующий код ошибки", 0);

    }


}
