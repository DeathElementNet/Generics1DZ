import java.util.Random;

public class MagicBox<T> {


    private T[] items;

    public MagicBox(int size) {

        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) { //добавление итема в коробку
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;

                return true;
            }
        }
        System.out.println("В коробке больше нет места!");
        return false;
    }

    public T pick() throws RuntimeException { //метод для проверки заполнености коробки.

        Random random = new Random();
        int randomInt = random.nextInt(items.length);

        int elements = 0;

        for (T e : items) {
            if (e == null) {
                elements+= 1;

            }
        }
        if (elements != 0) {
            throw new RuntimeException(" Еще есть место! Коробка полностью не заполнена, осталось заполнить " + elements + " эелементов!");
        }
        return items[randomInt];
    }


}

