package String;

//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Main5 {
    public static void main(String[] args) {
        String myText = " hello          there           man  ";
       String newText = myText.replaceAll(" +", " ").trim();
        System.out.println(myText);
        System.out.println(newText);

    }
}
