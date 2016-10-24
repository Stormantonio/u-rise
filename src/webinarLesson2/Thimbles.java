package webinarLesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anton on 24.10.2016.
 */
public class Thimbles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double moneyBaster = 1000;
        double moneyPlayer = 1000;
        for (; ; ) {
            int basket = (int) (1 + Math.random() * 3);
            System.out.println("Попробуйте угадать!");
            String replika = reader.readLine();
            if (replika.equals("exit")) {
                System.out.println("Игрок покинул игру!");
                return;
            }
            int otvet = Integer.parseInt(replika);
            if (otvet < 1 || otvet > 3) {
                System.out.println("Неправильный ответ!");
                continue;
            }
            if (basket == otvet) {
                moneyPlayer += 50;
                moneyBaster -= 50;
            } else {
                moneyPlayer -= 50;
                moneyBaster += 50;
            }

        }
    }
}
