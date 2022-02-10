package String;

//дан массив названий переменных в camelcase. преобразовать названия в snake_case

import java.util.regex.Pattern;
public class Main1 {
    public static void main(String[] args) {
        String[] strings = {"SomeString", "CamelCase", "SnakeCase"};
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
