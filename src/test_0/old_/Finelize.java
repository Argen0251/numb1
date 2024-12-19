public class Finelize {
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i * 2; // Заполняем массив
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] myArray = createArray(5); // Фабрика создаёт массив
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
