package Task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task2 {
    public static void builder() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/text.json"));
        String b;
        StringBuilder list1 = new StringBuilder();


        while ((b = br.readLine()) != null) {
            list1.append(b);
        }
        Map<String, String> map = new HashMap<>();
        String[] keys = list1.toString().replace("{", "").
                replace("[", "").
                replace("]", "").
                replace("\"", "").
                replaceAll("\\s", "").
                split("},");

        for (String a : keys) {
            String[] person = a.split(",");
            for (String keyValues : person) {
                String[] keyValue = keyValues.replace("}", "").split(":");
                String key = keyValue[0];
                String value = keyValue[1];
                map.put(key, value);
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
                    map.get("оценка"), map.get("предмет"));
        }
    } // с заданием 2 мне помог интернет, сам сделать не смог
    }

