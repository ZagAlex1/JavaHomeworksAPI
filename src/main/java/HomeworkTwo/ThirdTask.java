package HomeworkTwo;
//*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов
// средствами String и StringBuilder.


public class ThirdTask {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String string = "a";

        for (int i = 0; i < 1500; i++) {
            string += "a";
        }

        for (int i = 0; i < 1500; i++) {
            builder.append("a");
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < string.length(); i++) {
            string = string.replaceAll("a", "A");
        }
        System.out.println("Result: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < builder.length(); i++) {
            builder.delete(i, i + 1).insert(i, "A");
        }
        System.out.println("Result: " + (System.currentTimeMillis() - start));

        System.out.println(string);
        System.out.println(builder);
    }
}
