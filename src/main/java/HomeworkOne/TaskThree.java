package HomeworkOne;

//3.Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {

    public static int MAX_VALUE = Short.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("Введите число для проверки кратности: ");
        int inputNumber = inputNumber();
        int[] m1 = multiples(countLength(inputNumber), inputNumber);
        System.out.println(Arrays.toString(m1));

    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();
        return inputNumber;
    }

    public static int countLength(int inputNumber) {
        int count = 0;
        for (int i = 1; i <= MAX_VALUE; i++) {
            if (inputNumber % i == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int[] multiples(int arrayLength, int inputNumber) {
        int[] m1 = new int[arrayLength];
        int m1I = 0;
        for (int i = 1; i <= MAX_VALUE; i++) {
            if (inputNumber % i == 0) {
                m1[m1I] = i;
                m1I += 1;
            }
        }
        return m1;
    }
}
