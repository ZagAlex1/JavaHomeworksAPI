package HomeworkOne;

import java.util.Arrays;
import java.util.Scanner;

//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
public class TaskFour {

    public static int MIN_VALUE = Short.MIN_VALUE;

    public static void main(String[] args) {
        System.out.println("Введите число для проверки кратности: ");
        int inputNumber = inputNumber();
        int[] m2 = multiples(countLength(inputNumber), inputNumber);
        System.out.println(Arrays.toString(m2));

    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.close();
        return inputNumber;
    }

    public static int countLength(int inputNumber) {
        int count = 0;
        for (int i = -1; i >= MIN_VALUE; i--) {
            if (inputNumber % i != 0) {
                count += 1;
            }
        }
        return count;
    }

    public static int[] multiples(int arrayLength, int inputNumber) {
        int[] m2 = new int[arrayLength];
        int m2I = 0;
        for (int i = -1; i >= MIN_VALUE; i--) {
            if (inputNumber % i != 0) {
                m2[m2I] = i;
                m2I += 1;
            }
        }
        return m2;
    }
}
