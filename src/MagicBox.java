import java.util.Random;

public class MagicBox<T> {


    private int size;

    private T[] items;
    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item) {
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
        int elements = 0;
        for (T e : items) {
            if (e == null) {
                elements++;
            }
        }
        if (elements != 0) {
            throw new RuntimeException(" Еще есть место! Коробка полностью не заполнена, осталось заполнить " + elements + " эелементов!");
        }
        return items[random()];
    }

    private int random() {
        Random random = new Random();
        int randomInt = random.nextInt(size - 1); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        return randomInt;
    }
}