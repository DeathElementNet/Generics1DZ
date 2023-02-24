public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxString = new MagicBox<>(2);
        MagicBox<Integer> magicBoxInteger = new MagicBox<>(6);
        MagicBox<String> magicBoxError = new MagicBox<>(4);

        magicBoxString.add("1. Юрий");
        magicBoxString.add("2. Елена");
        magicBoxString.add("3. Михаил");

        String box = magicBoxString.pick();
        System.out.println(box);

        magicBoxInteger.add(1);
        magicBoxInteger.add(2);
        magicBoxInteger.add(3);
        magicBoxInteger.add(4);
        magicBoxInteger.add(5);

        int numberBox = magicBoxInteger.pick();
        System.out.println(numberBox);

        magicBoxError.add("Ошибка");
        magicBoxError.pick();
    }
}