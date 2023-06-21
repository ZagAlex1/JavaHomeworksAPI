package HomeworkThree;
//Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class TaskArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = addList(10);
        System.out.println(numbers);
        System.out.println(delEvenNumbers(numbers));
        minMaxValue(numbers);
        averageValue(numbers);

    }

    public static void averageValue(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = sum / list.size();
        System.out.println("Average : " + average);
    }

    public static void minMaxValue(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
        System.out.println("Min value : " + list.get(0));
        System.out.println("Max value : " + list.get(list.size() - 1));
    }

    public static ArrayList<Integer> delEvenNumbers(ArrayList<Integer> list) {

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
//        for (int i = list.size() - 1; i > 0; i--) {
//            if (list.get(i) % 2 == 0) {
//                list.remove(i);
//            }
//        }
        return list;
    }

    public static ArrayList<Integer> addList(int size) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            numbers.add(new Random().nextInt(1, 21));
        }
        return numbers;
    }
}
