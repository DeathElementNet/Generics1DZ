import java.util.Random;

public class MagicBox<T> {

    private int value;

    private T[] items;
    public MagicBox(int value) {
        this.value = value;
        this.items = (T[]) new Object[value];
    }

    public boolean add(T item) {
        for (T i : items) {
            if (i == null) {
                i = item;
            }
        }
        for (int j = 0; j < items.length; j++) {
            if (items[j] == null) {
                items[j] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
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
        int randomInt = random.nextInt(value - 1); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        return randomInt;
    }
}