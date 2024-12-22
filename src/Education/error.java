package Education;

public class error {

    String[] error={"Ошибка вывода", "Ошибка ввода","Отсутствует место на диске", "Выход индекса за границы диапазона"};
    public String err(int i) {
        if (i >= 0 & i < error.length) {
            return error[i];
        } else {
            return "Несуществующий код ошибки";
        }
    }
}
