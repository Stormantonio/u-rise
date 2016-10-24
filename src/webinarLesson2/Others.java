package webinarLesson2;

import java.util.Objects;

/**
 * Created by Anton on 25.10.2016.
 */
public class Others {
    public static void main(String[] args) {

        /*for (int i = 0; i < 23; i++) {
            System.out.print((char) ('a' + i));
        }*/

        /*char ch = '\t';
        for (int i = 0; i < 23; i++) {
            System.out.print("hello" + ch);
        }*/


        /*char a = 'а';
        char z = 'я';

        System.out.println("Числа, соответствующие кириллическому алфавиту:");
        for (int i = (int) a; i < (int) z; i++) {
            System.out.println(((char) (i)) + " = " + i);
        }*/


        Integer a = 70;
        Integer b = 30;
        b += 40;
        System.out.println(a == b);  // true

        Integer c = 700;
        Integer d = 300;
        d += 400;
        System.out.println(c == d);  // false: числа Int-овые до 128-ми будут храниться в ссылке в одном пуле, а если число превышает 128, то
                                     // они будут храниться тогда в другом пуле. И тогда ссылки будут разные, хотя и будут находиться
                                     // в одном стеке.

        Integer e = new Integer(70);
        Integer f = new Integer(30);
        f += 40;
        System.out.println(e == f);  // false:

        Integer g = 70;
        Integer h = new Integer(30);
        h += 40;
        System.out.println(g == h);  // true


        // сравнение примитивов
        int a1 = 1;
        int a2 = 1;
        System.out.println(Objects.equals(a2, a1)); // true // Objects.equals() можно сравнить любые обьекты и можно сравнить прмитивы
    }
}