package String;
// вводится строка. требуется удалить из нее повторяющиеся символы и все пробелы. например, если было введено "abc cde def", то должно быть выведено "abcdef"
import java.util.LinkedHashSet;
import java.util.Set;

public class Main13 {
    public static void main(String[] args) {
        String myText = "abc cde def";
        String newText = myText.replaceAll(" +", "");
        char[] chars = newText.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
            String input = "abc cde def";
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                if(!result.contains(String.valueOf(input.charAt(i)))) {
                    result += String.valueOf(input.charAt(i)).replaceAll(" +", "");
                }
            }
        System.out.println(result);

        }
    }

