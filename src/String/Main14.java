package String;

//Дана строка символов. Вывести на экран самое длинное слово

public class Main14 {
    public static void main(String[] args) {
        String str = "три четыре ааааааааааааааааааааааааа прокрастинация ура гиперкликемический";
        String[] res = str.split(" ");
        String max = res[0];
        for(int i = 1; i < res.length; ++i){
            if(max.length() < res[i].length())
                max = res[i];
        }
        System.out.println("Самое длинное слово: " + max);
    }
}
