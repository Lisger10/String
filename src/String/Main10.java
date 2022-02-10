package String;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”

public class Main10 {
    public static void main(String[] args) {
        String str = "информатика";
        char c = str.charAt(7);
        int start = 3;
        int end = 5;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        String str2 = String.valueOf(dst);
        String str1 = String.valueOf(c);
        String strF = str1 + str2 + str1;
        System.out.print(strF);

    }
}
