package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        MyArrayList<Integer> arr = new MyArrayList<>();

        //Проверяем отработку метода добавления элементов + расширение массива
        for (int i = 0; i <= 12; i++) {
            arr.addElementByIndex(rnd.nextInt(1, 100)); //index 0
        }
        System.out.println("Arr length is : " + arr.length() + "\n");

        for (int i = 0; i <= 12; i++) {
            System.out.println("Arr index is : " + i + " | Value is : " + arr.getElementByIndex(i) + "\n");
        }
        
        //Находим элемент
        System.out.println("Element for remove is : " + arr.getElementByIndex(4));
        //Удаляем элемент
        arr.removeElementByIndex(4);
        System.out.println("Founded value by index after remove : " + arr.getElementByIndex(4));

        System.out.println("Arr length is : " + arr.length());

        for (int i = 0; i <= 12; i++) {
            System.out.println("Arr index is : " + i + " | Value is : " + arr.getElementByIndex(i) + "\n");
        }
    }
}