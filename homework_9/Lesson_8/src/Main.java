public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();

        for (int i = 0; i < 30; i++) {
            strings.add("Marsel");
        }

        MyArrayList<Human> humans = new MyArrayList<>();

        Human h1 = new Human(22, "Marsel");
        Human h2 = new Human(21, "Andrey");
        Human h3 = new Human(19, "Vlad");
        Human h4 = new Human(19, "Vadim");

        humans.add(h1);
        humans.add(h2);
        humans.add(h3);

        System.out.println(humans.indexOf(h2));
        System.out.println(humans.get(1));

        humans.remove(h2);
        humans.removeAt(2);

        System.out.println(humans.get(2));
    }
}