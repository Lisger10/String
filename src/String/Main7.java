package String;

public class Main7 {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("word");

        strBuffer.insert(0, 's');
        System.out.println(strBuffer.toString());

    }
}
