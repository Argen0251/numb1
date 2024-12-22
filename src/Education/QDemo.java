package Education;

import java.util.SortedMap;

public class QDemo {
    public static void main(String[] args) {
        Queue bigq =new Queue(100);
        Queue smallq =new Queue(4);
        char ch;

        System.out.println("Icпoльзoвaниe очереди ЬigQ для\n" +
                "Cохранения алфавита");
        for (int i = 0; i < 26; i++) {
            bigq.put((char) ('a' + i));
        }
        System.out.println(" Coдepжимoe очереди bigq: ");
        for (int i = 0; i < 26; i++) {
            ch = bigq.get();
            if (ch!= (char) 0){
                System.out.print(ch);
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(" Пoпыткa сохранения " +
            ( char) ( 'z' - i) );
            smallq.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println( );
        System.out.println("Содержимое smallq: ");
        for (int i = 0; i < 5; i++) {
            ch = smallq.get();
            if (ch!= (char) 0){
                System.out.print(ch);
            }
        }

    }
}
