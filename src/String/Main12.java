package String;

//Из заданной строки получить новую, повторив каждый символ дважды
public class Main12 {
    public static void main(String[] args) {
        String string = "okey";
        String stringTemp = string.replaceAll(".", "$0$0");
        System.out.println(stringTemp);
    }
}
