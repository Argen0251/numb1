package test_0.old_;

public class demo {
    int х;
    demo (int i) {
        х = i;}

// Вызывается при удалении объекта
        protected void finalize () {
            System.out.println("Финaлизaция " + х);}

// Генерирует объект, который тотчас уничтожается
            void generator(int i) {
                demo о = new demo(i);}
}
