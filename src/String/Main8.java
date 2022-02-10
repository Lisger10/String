package String;

//В строке вставить после каждого символа 'а' символ 'b'.

public class Main8 {
    public static void main(String[] args) {
        String str = "ama Mama".replaceAll("a", "ab");
        System.out.println(str);

    }
}
