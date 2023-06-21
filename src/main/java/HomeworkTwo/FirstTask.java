package HomeworkTwo;

//Дана строка sql-запроса:
//"select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//В итоге должно получится:
//select * from students where name=Ivanov, country=Russia, city=Moscow


import java.util.Arrays;

public class FirstTask {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("select * from students where ");

        String data = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        data = data.replaceAll("\"","").replace(", age:null","").replaceAll(":","=");

        builder.append(data);
        System.out.println(builder);
    }

}
















