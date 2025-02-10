package src;

/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyArrayList<T> {

    private static final int MAX_SIZE = 3;
    private T[] elements; // массив для хранения элементов
    private int count;

    public MyArrayList() {
        this.elements = (T[]) new Object[MAX_SIZE];
    }

    public void addElementByIndex(T element) {
        if (this.count < this.elements.length) {
            this.elements[this.count] = element;
            this.count++;
        } else {
            T[] temp = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                temp[i] = this.elements[i];
            }
            this.elements = temp;
            this.elements[this.count] = element;
            this.count++;

        }
    }

    public void removeElementByIndex(int index) {
        for (int i = index; i < this.elements.length - 1; i++) {
            if (i == index) {
             for (int j = i; j < this.count - 1; j++){
                 this.elements[j] = this.elements[j+1];
             }
                this.elements[count - 1] = null;
                this.count--;
            }
        }
    }

    public T getElementByIndex(int index) {
        return this.elements[index];
    }

    public int length() {
        return this.count;
    }
}