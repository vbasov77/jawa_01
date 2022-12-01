// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Разберите строку, используя String.split.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}


package ru.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static String removeStr(String source) {
        return source.replaceAll("[\"\" \"{}]", "");
    }

    public static String Split(String str) {
        str = removeStr(str);
        String[] arr = str.split(",");
        String new_str = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String and = "";
            if (count >= 1) {
                and = "AND ";
            }
            String[] q = arr[i].split(":");
            if (!Objects.equals(q[1], new String("null"))) { // Сравнение строк
                new_str = new_str + and + q[0] + " = " + "\"" + q[1] + "\"" + " ";
            }
            count++;
        }
        return new_str;
    }

    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String sql = Split(str);
        System.out.println("SELECT * FROM students WHERE " + sql);
    }
}