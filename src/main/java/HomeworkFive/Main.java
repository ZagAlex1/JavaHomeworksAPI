package HomeworkFive;

//Задание
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Ivan", "202122");
        addContact(phoneBook, "Ivan", "202123");
        addContact(phoneBook, "Ivan", "202124");
        addContact(phoneBook, "Petr", "202125");
        addContact(phoneBook, "Petr", "202126");
        addContact(phoneBook, "Vladimir", "202127");

        System.out.println(phoneBook);

        ArrayList<String> names = new ArrayList<>();
        for (String s : phoneBook.keySet()) {
            names.add(s);
        }

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return phoneBook.get(o1).size() - phoneBook.get(o2).size();
            }
        });

        System.out.println(names);
    }

    private static void addContact(HashMap<String, ArrayList<String>> phoneBook, String name, String number) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(number);
    }
}

