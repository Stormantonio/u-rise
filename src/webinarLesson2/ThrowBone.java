package webinarLesson2;

import java.io.IOException;

/**
 * Created by Anton on 24.10.2016.
 */
public class ThrowBone {
    public static void main(String[] args) throws IOException{
        for (int i = 0; i < 100000; i++) {
            int bone1 = (int) (Math.random() * 6) + 1;
            int bone2 = (int) (Math.random() * 6) + 1;
            int bone3 = (int) (Math.random() * 6) + 1;
            System.out.println(bone1 + bone2 + bone3);
        }
    }
}
