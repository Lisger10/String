package String;

//Замените в строке все вхождения 'word' на "letter".

public class Main2 {
    public static void main(String[] args) {
        String str = "My word is the last word".replace("word","letter");
        System.out.println(str);
    }
}
