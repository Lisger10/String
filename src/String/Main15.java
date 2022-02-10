package String;

//Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке Х.

public class Main15 {
    public static void main(String[] args) {
        String str = "Привет. Хорошо выглядишь! Сегодня такой хороший ден! Как у тебя дела? Отлично! А ты как?";
        String[] res = str.split("[.!?]");
        int count = 0;
        for (String s: res){
           count++;
        }
        System.out.println(count);
    }

}
