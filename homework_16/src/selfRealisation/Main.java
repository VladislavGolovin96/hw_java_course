package selfRealisation;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        for (int i = 0; i < 10; i++) {
            linkedList.add(i + 1);
        }

        for (int num : linkedList) {
            System.out.println(num);
        }

    }
}
