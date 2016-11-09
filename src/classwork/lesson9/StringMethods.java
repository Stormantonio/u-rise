package classwork.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anton on 27.10.2016.
 */
public class StringMethods {
    public static void main(String[] args) {
        //   StringBuffer - многопоточные приложения.
        //   StringBuilder - простой. Работает быстрее, чем StringBuffer, но он небезопасный в плане использования потоков.
//        String text = "some text" + '\n';
//        StringBuffer stringBuffer = new StringBuffer();
//        String s = "";
//        for (int i = 0; i < 100; i++) {
//            // text += text; // съедает всю память
//            stringBuffer.append(text);
//        }
//        System.out.println(stringBuffer.toString());



        /*String text1 = "Коля заработал 10000 рублей, Миша - 17563 рубля, а Катя - 50000 рублей";
        System.out.println(text1.replaceAll("\\d+", ""));*/


        String text2 = "Коля заработал 10000 рублей, Миша - 17563 рубля, а Катя - 50000 рублей";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text2);

        /*// 1 вариант
        while (m.find()) {
            System.out.println(m.group(0));
        }*/


        // 2 варинат
        while (m.find()) {
            System.out.println(text2.substring(m.start(), m.end()));
        }
    }
}