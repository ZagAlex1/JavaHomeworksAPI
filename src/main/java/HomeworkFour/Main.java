package HomeworkFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//1.Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//2.Вывод в формате Фамилия И.О. возраст пол
//3.Добавить возможность выхода или вывода списка отсортированного по возрасту!)
//*реализовать сортировку по возрасту с использованием индексов
//*реализовать сортировку по возрасту и полу с использованием индексов

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        setData(id, name, age, gender);
        infoPeople(id, name, age, gender);

        Collections.sort(id, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return age.get(o1) - age.get(o2);
            }
        });
        System.out.println(id);

    }

    public static void infoPeople(ArrayList<Integer> id, ArrayList<String> name,
                                  ArrayList<Integer> age, ArrayList<String> gender) {
        for (int i = 0; i < name.size()-1; i++) {
            System.out.println("ID: " + id.get(i) + " ФИО: " + name.get(i) + " Возраст: " + age.get(i) + " Пол: " + gender.get(i));
        }
    }

    public static void setData(ArrayList<Integer> id, ArrayList<String> name,
                               ArrayList<Integer> age, ArrayList<String> gender) {
        int countId = 0;
        while(true) {
            id.add(countId);
            name.add(fieldString("ФИО : "));
            if(name.contains("q")){
                break;
            }
            age.add(fieldInt("Возраст : "));
            if(age.contains(-1)){
                break;
            }
            gender.add(fieldString("Пол : "));
            if(gender.contains("q")){
                break;
            }
            countId++;
        }
    }

    public static String fieldString(String msg){
        System.out.print(msg);
        String field = scanner.nextLine();
        return field;

    }public static int fieldInt(String msg){
        System.out.print(msg);
        int field = scanner.nextInt();
        scanner.nextLine();
        return field;
    }

}












