//Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит json и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
package ru.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static String removeStr(String source) {
        return source.replaceAll("[\"\" \"{}]", "");
    }


    public static void MyMethod(String str) {
        str = removeStr(str);
        String[] arr = str.split(",");
        String[] new_arr = {};
        ArrayList<String> array = new ArrayList<String>();
        int l = 0;
        int count = 0;
        while (l < arr.length) {
            array.add(arr[l]);
            count++;
            if (count == 3) {
                String[] name = array.get(0).split(":");
                String[] evaluation = array.get(1).split(":");
                String[] subject = array.get(2).split(":");
                StringBuilder builder = new StringBuilder();
                builder.append("Студент " + name[1]);
                builder.append(" получил " + evaluation[1]);
                builder.append(" по предмету " + subject[1]);
                String result = builder.toString();
                System.out.println(result);
                array.clear();
                count = 0;
            }
            l++;
        }

    }

    public static void main(String[] args) {
        String str = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        MyMethod(str);

    }
}