package String;

// Проверить, является ли заданное слово палиндромом.

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner cs = new Scanner(System.in);
        String str = cs.nextLine();
        StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.reverse();
        if (strBuffer.toString().equals(str)) {
            System.out.println("Слово палиндром");
        }
        else
            System.out.println("Слова не совпадают");

    }
}
