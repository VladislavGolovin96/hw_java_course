import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[100];
        Random random = new Random();
        int[] ageFrequency = new int[100];
        int mostFrequencyAge = 0;
        int countOfFrequency = 0;
        List<Integer> allNumbers = new ArrayList<>();

        //Заполняем массив humans
        for(int i = 0; i < 100; i++) {
           humans[i] = new Human("user" + 1, random.nextInt(1,100));
        }

        //Отмечаем количество повторений повторяющихся возрастов
        for (int i = 0; i < humans.length; i++) {
            ageFrequency[humans[i].age] += 1;
        }

        //Находим самый частый встречающийся возраст и его количество повторений. Есть небольшой косяк в логике: Что если наиболее повторяющихся имен будет несколько?
        //По хорошему их нужно выводить все, а не по последнему входу.

        for (int j = 0; j < ageFrequency.length; j++) {
            if (ageFrequency[j] >= countOfFrequency){
                mostFrequencyAge = j;
                countOfFrequency = ageFrequency[j];
            }
        }

        //Здесь я немного улучшил код, добавив реализую, которая выводит все числа, с наиболее частым повторением
        for (int i = 0; i < ageFrequency.length; i++) {
            if (ageFrequency[i] == countOfFrequency){
                allNumbers.add(i);
            }
        }
        for (int number : allNumbers) {
            System.out.println("Самый частый возраст/возрасты : " + number + "\n" + "Количество повторений: " + countOfFrequency);
        }

    }
}