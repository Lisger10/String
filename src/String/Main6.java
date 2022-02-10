package String;
//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
public class Main6 {
    public static void main(String[] args) {
        String s = "hkjhjh      jkhjh   hkjhl             kjhjhj   kjhjh                  lkjhjh kjhj         jlhj";
        int max = 0, curmax = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                curmax++;
                if (curmax > max) max = curmax;
            } else curmax = 0;
        }
        System.out.println(max);
    }
}
