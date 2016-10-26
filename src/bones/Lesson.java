package bones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anton on 26.10.2016.
 */
public class Lesson {
    public static void main(String[] args) {
        // Поток чтения, еще оператор управляющей последовательности continue, и некоторые математические методы (функции) класса Math
        /*for (int i = 0; i < 100; i++) {
            int d = (int) (1 + Math.random() * 6);
            System.out.println(d);
        }*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            int throwBone = (int) (1 + Math.random() * 6);
            System.out.println("Попробуйте угадать.....");
            int yourAnswer;
            try {
                yourAnswer = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Некорректный ввод");
                continue;
            }
            System.out.println("Выпоняется оператор сравнения");
            if (throwBone == yourAnswer) {
                System.out.println("Угадали");
                break;
            }
        }
    }
}
