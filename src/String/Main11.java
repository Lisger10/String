package String;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”. (2 способа)

public class Main11 {
    public static void main(String[] args) {
        int count = 0;
        String str = "Mama ama banana";
        for(char c: str.toCharArray()){
            if(c == 'a') {
                count++;
            }
        }
        System.out.println(count);

        int count1 = 0;
        String str1 = "ali baba";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == 'a')
            {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
