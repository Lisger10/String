package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// В строке найти количество цифр.
public class Main4 {
    public static void main(String[] args) {
        String str = "123 hello 125 ok 12 13";
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher(str);
        int i=0;

        while (m.find()){
            i++;
        }
        System.out.println(i);
    }

}
