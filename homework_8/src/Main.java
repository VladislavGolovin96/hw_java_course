public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();

        for (int i = 0; i < 30; i++) {
            strings.add("Marsel");
        }

        MyArrayList<Human> humans = new MyArrayList<>();

        Human h1 = new Human(30, "Marsel");
        Human h2 = new Human(25, "Vlad");
        Human h3 = new Human(19, "Vadim");
        Human h4 = new Human(22, "Andrey");

        humans.add(h1);
        humans.add(h2);
        humans.add(h3);
        humans.add(h4);

        System.out.println(humans.indexOf(h4));
        System.out.println(humans.get(1));

        humans.remove(h2);
        humans.removeAt(1);

        System.out.println(humans.get(1));
    }
}