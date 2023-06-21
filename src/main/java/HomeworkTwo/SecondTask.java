package HomeworkTwo;

//Дополнительные задания
//Дана json-строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        String[] persons = mainArray();

        String[] person0 = data(persons[0]);
        String[] person1 = data(persons[1]);
        String[] person2 = data(persons[2]);

        System.out.println(information(person0));
        System.out.println(information(person1));
        System.out.println(information(person2));

    }

    public static String[] mainArray() {
        String data = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] datas = data.replace("[", "").replace("]", "").split("},");
        System.out.println(Arrays.toString(datas));
        return datas;
    }

    public static String[] data(String person) {
        String[] personN = person.replace("{\"", "")
                .replaceAll("\\p{P}", " ")
                .replaceAll("\\s+", " ").split(" ");
        return personN;
    }

    public static StringBuilder information(String[] person) {
        StringBuilder information = new StringBuilder();
        information.append("Студент ").append(person[1]).append(" получил ")
                .append(person[3]).append(" по предмету ").append(person[5]);

        return information;
    }
}
