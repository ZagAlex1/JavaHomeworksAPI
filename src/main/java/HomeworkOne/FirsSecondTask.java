package HomeworkOne;

//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

import java.util.Random;

public class FirsSecondTask {

    public static void main(String[] args) {
        System.out.println("Hомер старшего значащего бита выпавшего числа: " + olderByte(randomNumber(0, 2001)));
    }

    public static int randomNumber(int firstBound, int secondBound) {
        Random random = new Random();
        int number = random.nextInt(firstBound, secondBound);
        return number;
    }

    public static int olderByte(int number) {
        String n = Integer.toBinaryString(number);
        return n.length();
    }
}

